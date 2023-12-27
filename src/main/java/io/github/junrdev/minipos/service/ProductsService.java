package io.github.junrdev.minipos.service;

import io.github.junrdev.minipos.domain.dto.ProductDto;
import io.github.junrdev.minipos.domain.model.ProductModel;
import io.github.junrdev.minipos.domain.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    // DI
    private final ProductsRepository repository;

    @Autowired public ProductsService(ProductsRepository repository) {
        this.repository = repository;
    }

    // CRUD
    public ProductModel createProduct(ProductDto dto){
        return null;
    }

    public List<ProductModel> createProducts(List<ProductModel> models){
        return null;
    }

    public List<ProductModel> fetchProducts(){
        return null;
    }

    public ProductModel fetchProductById(String id){
        return null;
    }

    public ProductModel updateProduct(ProductModel model){
        return null;
    }

    public String deleteProduct(ProductModel model){
        return "Product Id";
    }

    // restrict access
    private final void deleteAllProducts(){

    }

}
