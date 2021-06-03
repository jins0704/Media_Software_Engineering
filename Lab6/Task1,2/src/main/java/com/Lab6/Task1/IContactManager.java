package com.Lab6.Task1;

import java.util.List;
import java.util.UUID;

public interface IContactManager {

    boolean addContact(Contact contact);
    boolean deleteContact(Contact contact);
    boolean editContact(Contact contact);

    List<Contact> getContacts();
    Contact getContactById(UUID id);
}

