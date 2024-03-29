package com.devsuperior.uri2621;

import com.devsuperior.uri2621.dto.ProductNameDTO;
import com.devsuperior.uri2621.projections.ProductNameProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.uri2621.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Uri2621Application implements CommandLineRunner {

	@Autowired
	private ProductRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Uri2621Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ProductNameProjection> list = repository.search1(10, 20, "P");
		List<ProductNameDTO> result1 = list.stream().map(ProductNameDTO::new).collect(Collectors.toList());
		result1.forEach(System.out::println);

		List<ProductNameDTO> list2 = repository.search2(10, 20, "P");
		list2.forEach(System.out::println);
	}
}
