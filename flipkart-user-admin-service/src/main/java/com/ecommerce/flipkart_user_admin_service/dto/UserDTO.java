package com.ecommerce.flipkart_user_admin_service.dto;

public class UserDTO {

    private String name;
    private String contact;
    private Long id;

    public UserDTO() {}

    public UserDTO(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public UserDTO(String name, String contact, Long id) {
        this.name = name;
        this.contact = contact;
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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
