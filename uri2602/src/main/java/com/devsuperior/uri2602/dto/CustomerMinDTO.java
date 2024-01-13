package com.devsuperior.uri2602.dto;

import com.devsuperior.uri2602.projections.CustomerMinProjection;

public class CustomerMinDTO {
    private String name;

    public CustomerMinDTO() {}

    public CustomerMinDTO(String name) {
        this.name = name;
    }

    public CustomerMinDTO(CustomerMinProjection obj) {
        name = obj.getName();
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "[name = " + name + "]";
    }
}
