package com.geekster.ecommerce.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    private String addressName;

    private String landmark;

    private String phoneNumber;

    private String zipcode;

    private String state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_user_userId")
    private User user;
}

