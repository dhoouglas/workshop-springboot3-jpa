package com.douglaslima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglaslima.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
