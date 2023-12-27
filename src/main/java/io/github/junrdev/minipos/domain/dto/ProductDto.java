package io.github.junrdev.minipos.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {
    private String pName;
    private Long pPrice;

    private Long pNumStock;
}
