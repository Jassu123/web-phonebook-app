/**
 * 
 */
package se.contacts.service;

import java.util.List;

import se.contacts.entity.ContactDetails;

/**
 * @author siva
 *
 */
public interface ContactService {
	
	public Boolean saveContact(ContactDetails contactDetails);
	
	public List<ContactDetails> getContactDetails();
	
	public Boolean deleteContact(long contactId);
	
	public Boolean updateContactDetails(ContactDetails contactDetails);
	
	public ContactDetails editContactDetails(long contactId);
	
	

}
