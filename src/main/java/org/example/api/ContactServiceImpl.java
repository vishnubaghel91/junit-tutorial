package org.example.api;

import org.example.MobileNumberUtil;
import org.example.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl implements ContactService {

    private ContactCache contactCache;

    public ContactServiceImpl(ContactCache contactCache) {
        this.contactCache = contactCache;
    }

    @Override
    public List<Contact> findByTerm(String term) {
        List<Contact> contacts = contactCache.getAllContacts();
        List<Contact> filteredList = new ArrayList<>();
        if (MobileNumberUtil.isValidMobileKey(term)) {
            contacts.forEach(contact -> {
              if (contact.getMobileNumber().contains(term)) {
                  filteredList.add(contact);
              }
            });
        } else {
            contacts.forEach(contact -> {
                if (contact.getName().contains(term) || contact.getEmail().contains(term)) {
                    filteredList.add(contact);
                }
            });
        }
        return filteredList;
    }
}
