package com.example.managecontact;

import com.example.managecontact.dao.ContactRepository;
import com.example.managecontact.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class ManageContactApplication implements CommandLineRunner {
    @Autowired
    private ContactRepository contactRepository;
    public static void main(String[] args) {

        SpringApplication.run(ManageContactApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        contactRepository.save(new Contact("Mouhaouir","Oussama",df.parse("01/04/1995"),"oussama@mail.com","0665676532","oussama.jpeg"));
        contactRepository.save(new Contact("Mouhaouir","amine",df.parse("01/04/1995"),"amine@mail.com","0665688532","amine.jpeg"));
        contactRepository.findAll().forEach(contact -> System.out.println(contact.getFirstname()));
    }
}
