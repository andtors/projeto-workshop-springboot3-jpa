package com.educandoweb.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

/*Para cada classe que formos criar que contenha objetos, vamos criar uma subclasse para que possamos fazer a conexão entre o banco de dados e o programa utilizando as
 * sintaxes do SpringBoot*/

@RestController
@RequestMapping(value = "/user")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);
	}
}

