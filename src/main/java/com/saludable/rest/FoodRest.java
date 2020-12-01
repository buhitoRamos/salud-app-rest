package com.saludable.rest;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saludable.dao.FoodDAO;
import com.saludable.dao.UserDAO;
import com.saludable.model.Food;
import com.saludable.model.User;

@RestController
@CrossOrigin
@RequestMapping("food")
public class FoodRest {
	@Autowired
	FoodDAO foodDao;
	@Autowired
	UserDAO userDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Food food) {
		
			foodDao.save(food);	
	}
	
	
	@GetMapping("/listar")
	public List<Food> listar() {
		List <Food> lista = foodDao.findAll();
		for (Food food : lista) {
			try {
				String nombre=userDao.findById(food.getUser_id()).get().getNombre();
				String apellido=userDao.findById(food.getUser_id()).get().getApellido();
				System.out.println(nombre);
				food.setNombre(nombre);
				food.setApellido(apellido);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			
		}
		
		
		return lista;

	}
		

}
