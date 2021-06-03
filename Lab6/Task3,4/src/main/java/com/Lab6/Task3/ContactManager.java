package com.Lab6.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ContactManager implements IContactManager{

    private ContactRepository contactRepository;

    @Autowired
    public ContactManager(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    @Override
    public boolean addContact(Contact contact) {
        return contactRepository.create(contact);
    }

    @Override
    public boolean deleteContact(Contact contact) {
        return contactRepository.delete(contact);
    }

    @Override
    public boolean editContact(Contact contact) {
        return contactRepository.update(contact);
    }

    @Override
    public List<Contact> getContacts() {
        return contactRepository.all();
    }

    @Override
    public Contact getContactById(UUID id) {
        return contactRepository.byId(id);
    }

    @Override
    public List<Contact> getContactsByLastName(String lastName) {
        return contactRepository.byLastName(lastName);
    }
}