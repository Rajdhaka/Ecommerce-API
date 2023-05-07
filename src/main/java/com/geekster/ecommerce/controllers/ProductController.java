package com.geekster.ecommerce.controllers;

import com.geekster.ecommerce.models.Product;
import com.geekster.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping(value = "")
    public void addProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    @GetMapping(value = "/all")
    public Iterable<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping(value = "/category/{category}")
    public Iterable<Product> getProductByCategory(@PathVariable String category){
        return productService.fetchProductsByCategory(category);
    }

    @DeleteMapping(value = "/productId/{productId}")
    public void deleteProductById(@PathVariable Integer productId){
        productService.removeProductById(productId);
    }
}
