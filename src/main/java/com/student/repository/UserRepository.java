package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	   User findByEmail(String email);
}
