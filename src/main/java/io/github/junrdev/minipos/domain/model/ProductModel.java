package io.github.junrdev.minipos.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")

// lombok config
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ProductModel {

    @Id
    @SequenceGenerator(name = "product_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    private Long indexingKey;

    // from scanner
    private String productId;

    @Column(nullable = false)
    private String productName;

    private Long numberInStock;

    @Column(nullable = true)
    private String profilePicLink;

    @Column(nullable = false)
    private Long productPrice;
}
