package com.ecommerce.flipkart.controller;

import com.ecommerce.flipkart.dto.ProductDTO;
import com.ecommerce.flipkart.pojo.Product;
import com.ecommerce.flipkart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getProduct")
    public ResponseEntity<?> getProduct(@RequestBody ProductDTO productDTO) {
        return new ResponseEntity<>(productService.getProduct(productDTO.getProductId()), HttpStatus.OK);
    }

    @GetMapping("/getAllProduct")
    public ResponseEntity<?> getAllProduct() {
        try {
            return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addProduct")
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.OK);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<?> updateProduct(@RequestBody ProductDTO productDTO) {
        ResponseEntity<?> result;
        try {
            result = new ResponseEntity<>(productService.updateProduct(productDTO), HttpStatus.OK);
        } catch (Exception e) {
            result = new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return result;
    }

    @DeleteMapping("/deleteProduct")
    public ResponseEntity<String> deleteProduct(@RequestBody ProductDTO productDTO) {
        try {
            return new ResponseEntity<>(productService.deleteProduct(productDTO), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
