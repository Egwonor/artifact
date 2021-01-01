package com.ovo.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ovo.spring.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
