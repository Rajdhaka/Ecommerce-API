package com.geekster.ecommerce.services;

import com.geekster.ecommerce.models.Product;
import com.geekster.ecommerce.repositories.IProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductRepo productDao;

    public void createProduct(Product product) {
        productDao.save(product);
    }

    public Iterable<Product> getAllProducts() {
        return productDao.findAll();
    }

    public Iterable<Product> fetchProductsByCategory(String category) {
        return productDao.findProductByCategory(category);
    }

    @Transactional
    public void removeProductById(Integer productId) {
        productDao.deleteById(productId);
    }
}
