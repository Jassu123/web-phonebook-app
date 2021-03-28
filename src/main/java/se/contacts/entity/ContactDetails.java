/**
 * 
 */
package se.contacts.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author siva
 *
 */
@Entity
@Data
@Table(name="CONATCT_DETAILS")
public class ContactDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer contactID;
	
	private String contactName;
	
	private String contactEmail;
	
	private Long contactNumber;

}
