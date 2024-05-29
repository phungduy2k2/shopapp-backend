package com.example.shoppappspring.services;

import com.example.shoppappspring.dtos.ProductDTO;
import com.example.shoppappspring.dtos.ProductImageDTO;
import com.example.shoppappspring.models.Product;
import com.example.shoppappspring.models.ProductImage;
import com.example.shoppappspring.responses.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface IProductService {
    Product createProduct(ProductDTO productDTO) throws Exception;
    Product getProductById(long id) throws Exception;
    Page<ProductResponse> getAllProducts(PageRequest pageRequest);
    Product updateProduct(long id, ProductDTO productDTO) throws Exception;
    void deleteProduct(long id);
    boolean existsByName(String name);
    ProductImage createProductImage(
            Long productId,
            ProductImageDTO productImageDTO
    ) throws Exception;
}
