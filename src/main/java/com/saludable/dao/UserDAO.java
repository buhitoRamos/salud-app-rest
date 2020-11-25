package com.saludable.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saludable.model.User;
/*
 * Esta interface extiende de JpaRepository y tiene muchos de los metodos para
 * guardar, actualizar ya seteados.
 */

public interface UserDAO extends JpaRepository<User, Integer> {
	

}
