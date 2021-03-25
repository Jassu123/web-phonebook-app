package se.contacts.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import se.contacts.entity.ContactDetails;
import se.contacts.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Override
	public boolean saveContact(ContactDetails contactDetails) {

		return false;
	}

	@Override
	public List<ContactDetails> getContactDetails() {

		return null;
	}

	@Override
	public void deleteContact(long contactId) {

	}

	@Override
	public ContactDetails updateContactDetails(ContactDetails contactDetails) {

		return null;
	}

	@Override
	public ContactDetails editContactDetails(long contactId) {

		return null;
	}

}
