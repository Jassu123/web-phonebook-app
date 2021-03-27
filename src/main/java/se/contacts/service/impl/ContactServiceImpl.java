package se.contacts.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import se.contacts.entity.ContactDetails;
import se.contacts.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Override
	public Boolean saveContact(ContactDetails contactDetails) {

		return false;
	}

	@Override
	public List<ContactDetails> getContactDetails() {

		return null;
	}

	@Override
	public Boolean deleteContact(long contactId) {
		return null;

	}

	@Override
	public Boolean updateContactDetails(ContactDetails contactDetails) {

		return null;
	}

	@Override
	public ContactDetails editContactDetails(long contactId) {

		return null;
	}

}
