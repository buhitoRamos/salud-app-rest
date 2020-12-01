package com.saludable.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saludable.dao.PersonalDAO;
import com.saludable.model.Personal;


@RestController
@CrossOrigin
@RequestMapping("personal")
public class PersonalRest {
	
	@Autowired
	private PersonalDAO personalDao;
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Personal per) {
		List<Personal> lista = personalDao.findAll();
		boolean encontrado = false;
		Personal pers= new Personal();
		for (Personal p : lista) {
			if (p.getUsuario().equals(per.getUsuario())
				&&(p.getContraseña().equals(per.getContraseña()))
				){
				pers=p;
				encontrado = true;
			}

		}
		if (encontrado) {
			
			return ResponseEntity.status(HttpStatus.OK).body(pers);
		} else {

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);

		}
		

	}
	
	
	

}
