package com.douglaslima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglaslima.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
