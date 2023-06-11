package com.devserocaco.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devserocaco.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
