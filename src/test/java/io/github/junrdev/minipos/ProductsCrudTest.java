package io.github.junrdev.minipos;

import io.github.junrdev.minipos.domain.repository.ProductsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductsCrudTest {

    private final ProductsRepository repository;

    @Autowired public ProductsCrudTest(ProductsRepository repository) {
        this.repository = repository;
    }

    @Test void contextLoads(){}

    @Test
    public void testFetchProducts(){}

    @Test
    public void testFetchProductById(){}

    @Test
    public void testCreateProduct(){}

    @Test
    public void testCreateMultipleProducts(){}

    @Test
    public void testUpdateProduct(){}

    @Test
    public void testDeleteSingleProduct(){}

    @Test
    public void testDeleteAllProducts(){}
}
