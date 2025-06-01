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

    public Product getProductList(long productId){
        return productDAO.findById((int) productId).get();
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
//        Optional<Product> productId = productDAO.findById((int) productDTO.getProductId());
//        if(productId.isPresent()){
//            productDAO.delete(productId.get());
//        }
//        return new Optional<Product>();
//    }

    public String deleteProduct(ProductDTO productDTO) {
        Optional<Product> productId = productDAO.findById((int) productDTO.getProductId());

        if(productId.isPresent()){
            productDAO.delete(productId.get());
        }
        return "deleted the product";
    }
}
