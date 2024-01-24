package com.douglaslima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglaslima.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
