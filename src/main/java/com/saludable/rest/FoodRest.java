package com.saludable.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saludable.dao.FoodDAO;
import com.saludable.model.Food;

@RestController
@CrossOrigin
@RequestMapping("food")
public class FoodRest {
	@Autowired
	FoodDAO DAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Food food) {
		
			DAO.save(food);
			
		
		
		
		
		
			
	}
		

}
