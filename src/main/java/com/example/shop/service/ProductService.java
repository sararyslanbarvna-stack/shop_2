package com.example.shop.service;

import com.example.shop.dto.request.response.product.ProductRequest;
import com.example.shop.dto.request.response.product.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse createProduct(ProductRequest request);
    ProductResponse getProductById(Long id);
    List<ProductResponse> getAllProducts();
    ProductResponse updateProduct(Long id, ProductRequest request);
    void deleteProduct(Long id);
}