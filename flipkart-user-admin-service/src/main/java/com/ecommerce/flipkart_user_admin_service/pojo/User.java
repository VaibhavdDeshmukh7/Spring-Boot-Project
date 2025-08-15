package com.ecommerce.flipkart_user_admin_service.pojo;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "User")
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Integer id;

    @Column(name = "Name")
    @NonNull
    private String name;

    @Column(name = "Contact")
    @NonNull
    private String Contact;

    @Transient
    private Product product;
}
