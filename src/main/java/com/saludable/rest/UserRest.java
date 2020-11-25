package com.saludable.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saludable.dao.UserDAO;
import com.saludable.model.User;

@RestController
@CrossOrigin
@RequestMapping("usuario")
public class UserRest {

	@Autowired
	private UserDAO userDao;

	@GetMapping("/listar")
	public List<User> listar() {
		return userDao.findAll();

	}

	@PostMapping("/guardar")
	public ResponseEntity<?> guardar(@RequestBody User user) {
		List<User> lista = userDao.findAll();
		boolean encontrado = false;
		for (User user2 : lista) {
			if (user2.getUsuario().equals(user.getUsuario())) {
				encontrado = true;
			}

		}
		if (!encontrado) {
			userDao.save(user);
			return ResponseEntity.status(HttpStatus.OK).body(null);
		} else {

			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);

		}

	}

	@DeleteMapping("/borrar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		userDao.deleteById(id);

	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody User user) {
		userDao.save(user);
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {
		List<User> lista = userDao.findAll();
		boolean encontrado = false;
		User usuario= new User();
		for (User user2 : lista) {
			if (user2.getUsuario().equals(user.getUsuario())
				&&(user2.getContraseña().equals(user.getContraseña()))
				){
				usuario=user2;
				encontrado = true;
			}

		}
		if (encontrado) {
			
			return ResponseEntity.status(HttpStatus.OK).body(usuario);
		} else {

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);

		}
		

	}

}
