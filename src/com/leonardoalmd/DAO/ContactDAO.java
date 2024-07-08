package com.leonardoalmd.DAO;

import com.leonardoalmd.factory.ConnectionFactory;
import com.leonardoalmd.model.Contact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactDAO {
    // CREATE
    // READ
    // UPDATE
    // DELETE


    public void save (Contact contact) {
        String sql = "insert into contacts(name, age, registrationDate) values(?,?,?)";

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            ps = ConnectionFactory.createConnectionToMySQL().prepareStatement(sql);

            ps.setString(1, contact.getName());
            ps.setInt(2, contact.getAge());
            ps.setDate(3, contact.getRegistrationDate());

            ps.execute();
            ps.close();

        }   catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
