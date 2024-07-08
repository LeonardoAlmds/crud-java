package com.leonardoalmd;

import com.leonardoalmd.DAO.ContactDAO;
import com.leonardoalmd.factory.ConnectionFactory;
import com.leonardoalmd.model.Contact;

public class App {
    public static void main(String[] args) {
        Contact c = new Contact();
        c.setName("Leonardo Almeida");
        c.setAge(18);

        new ContactDAO().save(c);
    }
}
