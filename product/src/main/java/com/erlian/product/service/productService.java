/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erlian.product.service;

import com.erlian.product.repository.productRepository;
import com.erlian.product.entity.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Ideapad 3 14ITL6
 */
@Service
public class productService {
    @Autowired
    
    private productRepository productRepository;
    
    public List<Product> getAll(){
        return productRepository.findAll();
    }
    
    public void insert(Product product){
        productRepository.save(product);
    }
    
    public Product getProduct(Long id){
        return productRepository.findById(id).get();
    }
    
    
}
