package com.Lab6.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/contactbookdb")
public class ContactController  {

    @Autowired
    private ContactManager contactManager;

    @PostMapping("/add")
    public boolean add(@RequestBody Contact contact){
        return contactManager.addContact(contact);
    }

    @PutMapping("/del")
    public boolean delete(@RequestBody Contact contact){
        return contactManager.deleteContact(contact);
    }

    @GetMapping("/all")
    public List<Contact> all(){
        return contactManager.getContacts();
    }

    @GetMapping("/{id}")
    public Contact getById(@PathVariable UUID id){
        return contactManager.getContactById(id);
    }

    @PutMapping("/edit")
    public boolean edit(@RequestBody Contact contact){
        return contactManager.editContact(contact);
    }

    @GetMapping("/name/{lastname}")
    public List<Contact> byLastName(@PathVariable String lastname){
        return contactManager.getContactsByLastName(lastname);
    }
}