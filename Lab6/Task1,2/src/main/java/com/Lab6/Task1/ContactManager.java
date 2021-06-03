package com.Lab6.Task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ContactManager implements IContactManager {

    private List<Contact> contactList = new ArrayList<>();

    @Override
    public boolean addContact(Contact contact) {

        if(contact !=null && contactList.indexOf(contact)==-1){
            contactList.add(contact);
            return true;
        }

        return false;
    }

    @Override
    public boolean deleteContact(Contact contact) {

        System.out.println(contact.getId());
        for(Contact c: contactList){
            if(c.getId().equals(contact.getId())){
                contactList.remove(c);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean editContact(Contact contact) {

        for(Contact c: contactList){
            if(c.getId().equals(contact.getId())){
                c.setEmail(contact.getEmail());
                c.setFirstName(contact.getFirstName());
                c.setLastName(contact.getLastName());
                c.setPhone(contact.getPhone());
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Contact> getContacts() {
        return contactList;
    }

    @Override
    public Contact getContactById(UUID id) {

        for(Contact c: contactList){
            if(c.getId().equals(id)){
                return c;
            }
        }

        return null;
    }
}