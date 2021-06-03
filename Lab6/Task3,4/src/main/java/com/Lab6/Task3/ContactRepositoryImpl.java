package com.Lab6.Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@Repository
public class ContactRepositoryImpl implements ContactRepository {

    @Autowired
    private JdbcOperations jdbc; //JdbcTemplate

    public ContactRepositoryImpl(JdbcOperations jdbc) {
        this.jdbc = jdbc;
        this.jdbc.update("CREATE TABLE Contact (\n" +
                "\tid varchar(50) primary key,\n" +
                "\tfirstName varchar(50),\n" +
                "\tlastName varchar(50),\n" +
                "\tphone varchar(50),\n" +
                "\temail varchar(50)\n" +
                ")");

    }

    @Override
    public boolean create(Contact contact) {
        jdbc.update("INSERT INTO Contact (id, firstName, lastName, phone, email) VALUES(?,?,?,?,?)",
                contact.getId(),contact.getFirstName(),contact.getLastName(),contact.getPhone(),contact.getEmail());

        return true;
    }

    @Override
    public boolean delete(Contact contact) {
        jdbc.update("delete from contact where id=?", contact.getId());

        return true;
    }

    @Override
    public boolean update(Contact contact) {
        jdbc.update("update Contact set firstName=?,lastName=?,phone=?,email=? where id=?",
                contact.getFirstName(),contact.getLastName(),contact.getPhone(),contact.getEmail(),contact.getId());

        return true;
    }

    @Override
    public List<Contact> all() {
        return jdbc.query("select * from contact order by lastName",new ContactRowMapper());
    }

    @Override
    public Contact byId(UUID id) {
        return jdbc.queryForObject("select * from contact where id = ? order by lastName", new ContactRowMapper(),id);
    }

    @Override
    public List<Contact> byLastName(String lastName) {
        return jdbc.query("select * from contact where lastName = ? order by lastName", new ContactRowMapper(),lastName);
    }

    private static  class ContactRowMapper implements RowMapper<Contact> {
        @Override
        public Contact mapRow(ResultSet rs, int i) throws SQLException {
            Contact c = new Contact(UUID.fromString(rs.getString("id")),
                    rs.getString("firstName"),rs.getString("lastName"),
                    rs.getString("phone"),rs.getString("email"));

            return c;
        }
    }
}