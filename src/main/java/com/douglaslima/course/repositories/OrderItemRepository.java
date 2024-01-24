package com.douglaslima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglaslima.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
