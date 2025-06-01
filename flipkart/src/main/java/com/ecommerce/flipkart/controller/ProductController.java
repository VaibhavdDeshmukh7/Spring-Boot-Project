package com.ecommerce.flipkart.controller;

import com.ecommerce.flipkart.dto.ProductDTO;
import com.ecommerce.flipkart.pojo.Product;
import com.ecommerce.flipkart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getProduct")
    public ResponseEntity<?> getProduct(@RequestBody ProductDTO productDTO) {
        try {
            return new ResponseEntity<>(productService.getProductList(productDTO.getProductId()), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addProduct")
    public String createProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

//    @PutMapping("/updateProduct")
//    public Optional<Product> updateProduct(@RequestBody ProductDTO productDTO){
//        return productService.updateProduct(productDTO);
//    }

    @DeleteMapping("/deleteProduct")
    public ResponseEntity<String> deleteProduct(@RequestBody ProductDTO productDTO){
        try {
            return new ResponseEntity<>(productService.deleteProduct(productDTO), HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
