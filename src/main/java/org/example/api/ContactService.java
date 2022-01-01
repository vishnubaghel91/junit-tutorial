package org.example.api;

import org.example.model.Contact;

import java.util.List;

public interface ContactService {

   List<Contact> findByTerm(String term);

}
