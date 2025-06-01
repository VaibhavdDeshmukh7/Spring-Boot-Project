package com.ecommerce.flipkart.service;

import com.ecommerce.flipkart.dao.ProductDAO;
import com.ecommerce.flipkart.dto.ProductDTO;
import com.ecommerce.flipkart.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public Optional<Product> getProductList(){
        return productDAO.findById(1);
    }

    public String addProduct(Product product){
        try {
            productDAO.save(product);
        } catch (Exception e){
            System.out.println("Getting error while adding product");
            throw e;
        }
        return "Successfully Uploaded The Object";
    }


//    public Optional<Product> updateProduct(ProductDTO productDTO) {
//        Optional<Product> isExist = productDAO.findById(1);
//
//        if(isExist.isPresent()){
//
//        }
//        return new Optional<Product>();
//    }

    public Optional<Product> deleteProduct(ProductDTO productDTO) {
        Optional<Product> productId = productDAO.findById(Math.toIntExact(productDTO.getProductId()));

        if(productId.isPresent()){

        }
        return new Optional<Product>();
    }
}
