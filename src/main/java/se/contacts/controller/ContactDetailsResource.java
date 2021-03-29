/**
 * 
 */
package se.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import se.contacts.dto.ContactDetailsDTO;
import se.contacts.service.ContactService;

/**
 * @author Siva Nadupuru
 *
 */

@RestController
public class ContactDetailsResource {

	@Autowired
	private ContactService contactService;

	@PostMapping(value = "/contact/add", consumes = "application/json")
	public String addContact(@RequestBody ContactDetailsDTO contactDetails) {
		return contactService.saveContact(contactDetails);

	}

	@GetMapping("/contact/contactdetails")
	public List<ContactDetailsDTO> getContactDetails() {
		return contactService.getContactDetails();
	}

	@DeleteMapping(value = "/contact/delete/{contactId}")
	public String deleteContact(@PathVariable Integer contactId) {
		return contactService.deleteContactByID(contactId);

	}

	@PutMapping(value = "/contact/update", consumes = "application/json")
	public String updateProduct(@RequestBody ContactDetailsDTO contactDetailsDTO) {
		return contactService.updateContactDetails(contactDetailsDTO);
	}
}
