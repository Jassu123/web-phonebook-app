package se.contacts.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.contacts.dto.ContactDetailsDTO;
import se.contacts.entity.ContactDetails;
import se.contacts.repository.ContactRepositroy;
import se.contacts.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepositroy contactRepo;

	@Override
	public String saveContact(ContactDetailsDTO contactDetailsDTO) {

		ContactDetails contactDetails = new ContactDetails();
		BeanUtils.copyProperties(contactDetailsDTO, contactDetails);
		if (contactRepo.existsById(contactDetails.getContactID())) {
			return "Contact already exist";
		} else {
			contactRepo.save(contactDetails);
			return "Contact is added to Database";
		}
	}

	@Override
	public List<ContactDetailsDTO> getContactDetails() {
						
		 List<ContactDetails> contactDetails = contactRepo.findAll();
		 List<ContactDetailsDTO> contactDetailsDTO=new ArrayList<ContactDetailsDTO>();
		 contactDetails.forEach(contact->{
			 ContactDetailsDTO cDTO= new ContactDetailsDTO();
			 BeanUtils.copyProperties(contact, cDTO);
			 contactDetailsDTO.add(cDTO);
		 });
		 
		return contactDetailsDTO;
	}

	@Override
	public boolean updateContactDetails(ContactDetails contactDetails) {

		if (contactRepo.existsById(contactDetails.getContactID())) {
			contactRepo.saveAndFlush(contactDetails);
			return true;
		}

		else {
			return false;
		}
	}

	@Override
	public boolean deleteContactByID(int contactId) {
		if (contactRepo.existsById(contactId)) {
			contactRepo.deleteById(contactId);
			return true;
		}

		else
			return false;
	}

}
