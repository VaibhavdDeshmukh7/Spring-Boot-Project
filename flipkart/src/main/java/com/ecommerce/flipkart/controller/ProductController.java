package com.ecommerce.flipkart.controller;

import com.ecommerce.flipkart.dto.ProductDTO;
import com.ecommerce.flipkart.pojo.Product;
import com.ecommerce.flipkart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getProduct")
    public Optional<Product> getProduct() {
        return productService.getProductList();
    }

    @PostMapping("/addProduct")
    public String createProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

//    @PutMapping("/updateProduct")
//    public Optional<Product> updateProduct(@RequestBody ProductDTO productDTO){
//        System.out.println("hi");
////        return productService.updateProduct(productDTO);
//    }

    @DeleteMapping("/deleteProduct")
    public Optional<Product> deleteProduct(@RequestBody ProductDTO productDTO){
//        System.out.println("hi");

        return productService.deleteProduct(productDTO);
    }
}
