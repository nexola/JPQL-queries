package com.devsuperior.uri2621.dto;

import com.devsuperior.uri2621.projections.ProductNameProjection;

public class ProductNameDTO {
    private String name;

    public ProductNameDTO() {}

    public ProductNameDTO(String name) {
        this.name = name;
    }

    public ProductNameDTO(ProductNameProjection productNameProjection) {
        name = productNameProjection.getName();
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
