package org.example.api;

import org.example.model.Contact;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceTest {

    ContactService contactService;

    @Mock
    ContactCache contactCache;

    @Before
    public void setup() {
        //contactCache = Mockito.mock(ContactCache.class);
        contactService = new ContactServiceImpl(contactCache);
    }

    @Test
    public void testFindByTerm() {

        List<Contact> list = new ArrayList<>();
        Contact vishnu = new Contact("vishnu", "9632579900", "vishnu@gmail.com");
        Contact ram = new Contact("ram", "9632577800", "ram@gmail.com");
        Contact shyam = new Contact("shyam", "9645579900", "shyam@gmail.com");
        list.add(vishnu);
        list.add(ram);
        list.add(shyam);

        // when
        Mockito.when(contactCache.getAllContacts()).thenReturn(list);

        List<Contact> filteredContactList = contactService.findByTerm("96");
        Assert.assertEquals(3, filteredContactList.size());
        filteredContactList = contactService.findByTerm("m@gmail");
        Assert.assertEquals(2, filteredContactList.size());
    }
}
