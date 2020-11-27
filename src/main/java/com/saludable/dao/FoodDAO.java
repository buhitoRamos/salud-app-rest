package com.saludable.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saludable.model.Food;

public interface FoodDAO extends JpaRepository<Food, Integer>{

}
