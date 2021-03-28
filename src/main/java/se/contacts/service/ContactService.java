/**
 * 
 */
package se.contacts.service;

import java.util.List;

import se.contacts.dto.ContactDetailsDTO;
import se.contacts.entity.ContactDetails;

/**
 * @author siva
 *
 */
public interface ContactService {
	
	public String saveContact(ContactDetailsDTO contactDetailsDTO);
	
	public List<ContactDetails> getContactDetails();
	
	public boolean deleteContactByID(int contactId);
	
	public boolean updateContactDetails(ContactDetails contactDetails);
	

}
