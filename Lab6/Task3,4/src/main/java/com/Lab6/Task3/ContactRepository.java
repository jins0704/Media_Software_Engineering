package com.Lab6.Task3;

import java.util.List;
import java.util.UUID;

public interface ContactRepository {

    boolean create(Contact contact);
    boolean delete(Contact contact);
    boolean update(Contact contact);

    List<Contact> all();
    Contact byId(UUID id);
    List<Contact> byLastName(String lastName);
}