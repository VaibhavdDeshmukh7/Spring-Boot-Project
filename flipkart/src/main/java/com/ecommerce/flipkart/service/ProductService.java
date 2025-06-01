package com.ecommerce.flipkart.service;

import com.ecommerce.flipkart.dao.ProductDAO;
import com.ecommerce.flipkart.dto.ProductDTO;
import com.ecommerce.flipkart.exception.ProductNotFoundException;
import com.ecommerce.flipkart.pojo.Product;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public Product getProduct(long productId){
        return productDAO.findById((int) productId).orElseThrow(() -> new ProductNotFoundException("Product not found!!"));
    }

    public List<Product> getAllProduct(){
        return productDAO.findAll();
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

    @Transactional
    public String updateProduct(ProductDTO productDTO) {
        Optional<Product> product = productDAO.findById((int) productDTO.getProductId());
        if(product.isPresent()){
            Product changeProduct = product.get();
            changeProduct.setProductName(productDTO.getProductName());
            changeProduct.setPrice(productDTO.getPrice());
            changeProduct.setCategory(productDTO.getCategory());
            changeProduct.setProductDescription(productDTO.getProductDescription());
        }
        return "Successfully Updated the Product";
    }

    public String deleteProduct(ProductDTO productDTO) {
        Optional<Product> productId = productDAO.findById((int) productDTO.getProductId());
        productId.ifPresent(product -> productDAO.delete(product));
        return "deleted the product";
    }


}
