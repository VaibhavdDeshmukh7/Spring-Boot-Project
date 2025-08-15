package com.ecommerce.flipkart_user_admin_service.pojo;


import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Contact")
    private String Contact;

    public User(){};

    public User(String name, String contact) {
        this.name = name;
        Contact = contact;
    }

    public User(String name, String contact, Integer id) {
        this.name = name;
        Contact = contact;
        this.id = id;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
