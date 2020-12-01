package com.saludable.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saludable.model.Personal;

public interface PersonalDAO extends JpaRepository<Personal, Integer>{

}
