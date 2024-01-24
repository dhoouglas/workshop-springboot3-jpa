package com.douglaslima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglaslima.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
