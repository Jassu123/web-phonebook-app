package se.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se.contacts.entity.ContactDetails;

@Repository
public interface ContactRepositroy extends JpaRepository<ContactDetails, Integer> {

}
