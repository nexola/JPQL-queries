package com.devsuperior.uri2621.repositories;

import com.devsuperior.uri2621.dto.ProductNameDTO;
import com.devsuperior.uri2621.projections.ProductNameProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.uri2621.entities.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true, value = "SELECT products.name " +
            "FROM products " +
            "INNER JOIN providers ON products.id_providers = providers.id " +
            "WHERE products.amount BETWEEN :min AND :max " +
            "AND providers.name LIKE CONCAT(:letter, '%')")
    public List<ProductNameProjection> search1(Integer min, Integer max, String letter);

    @Query("SELECT new com.devsuperior.uri2621.dto.ProductNameDTO(obj.name) " +
            "FROM Product obj " +
            "WHERE obj.amount BETWEEN :min AND :max " +
            "AND obj.provider.name LIKE CONCAT(:letter, '%')")
    public List<ProductNameDTO> search2(Integer min, Integer max, String letter);
}
