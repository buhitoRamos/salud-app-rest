package com.saludable.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saludable.model.User;

public interface UserDAO extends JpaRepository<User, Integer> {
	

}
