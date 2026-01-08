package br.com.luiz.aulajpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luiz.aulajpa.entities.User;
import br.com.luiz.aulajpa.repositories.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserRepository repository;

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> result = repository.findAll();
		return ResponseEntity.ok(result);
	}
}
