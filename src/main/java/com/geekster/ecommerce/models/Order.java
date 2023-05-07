package com.geekster.ecommerce.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_userId")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_product_productId")
    private Product product;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_addressId")
    private Address address;

    private Integer productQuantity;

}
