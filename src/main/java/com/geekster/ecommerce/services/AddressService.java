package com.geekster.ecommerce.services;
import com.geekster.ecommerce.models.Address;
import com.geekster.ecommerce.repositories.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressService {
    @Autowired
    IAddressRepo addressDao;

    public void createAddress(Address address) {
        addressDao.save(address);
    }

    public Iterable<Address> getAllAddresses() {
        return addressDao.findAll();
    }
}
