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
	
	public boolean saveContact(ContactDetails contactDetails);
	
	public List<ContactDetails> getContactDetails();
	
	public void deleteContact(long contactId);
	
	public ContactDetails updateContactDetails(ContactDetails contactDetails);
	
	public ContactDetails editContactDetails(long contactId);
	
	

}
