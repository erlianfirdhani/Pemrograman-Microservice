/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erlian.product.Controller;

import com.erlian.product.entity.Product;
import com.erlian.product.service.productService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ideapad 3 14ITL6
 */
@RestController
@RequestMapping("api/v1/product")
public class productController {
    @Autowired
    private productService productService;
    
    @GetMapping
    public List<Product>getAll(){
        return productService.getAll();
        
    }
    
    @PostMapping
    public void insert(@RequestBody Product product){
        productService.insert(product);
    }
    
    @GetMapping(path = "{id}")
    public Product getProduct(@PathVariable("id") Long id){
        return productService.getProduct(id);
    }
}
