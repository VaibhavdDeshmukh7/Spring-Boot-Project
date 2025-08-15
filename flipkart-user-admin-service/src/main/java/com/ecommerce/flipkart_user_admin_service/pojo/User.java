package com.ecommerce.flipkart_user_admin_service.pojo;


import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Contact")
    private String Contact;

    public User(){};

    public User(String name, String contact) {
        this.name = name;
        Contact = contact;
    }

    public User(String name, String contact, Long id) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
