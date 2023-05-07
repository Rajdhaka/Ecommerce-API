package com.geekster.ecommerce.controllers;

import com.geekster.ecommerce.models.Address;
import com.geekster.ecommerce.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping(value = "")
    public void addAddress(@RequestBody Address address){
        addressService.createAddress(address);
    }

    @GetMapping(value = "/all")
    public Iterable<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }
}
