package io.github.junrdev.minipos.domain.repository;

import io.github.junrdev.minipos.domain.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<ProductModel, Long> {

    // add impls of JPA Query Methods

}
