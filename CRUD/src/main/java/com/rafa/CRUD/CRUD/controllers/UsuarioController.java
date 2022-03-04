package com.rafa.CRUD.CRUD.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rafa.CRUD.CRUD.model.entities.usuario;
import com.rafa.CRUD.CRUD.model.repositories.UsuarioRepository;

@RestController
@RequestMapping("/obter")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping()
	public usuario obterUsuario() {

		return new usuario("Rafa", 28);
	}
	
	@GetMapping("/vertodos")
	public Iterable<usuario> verTodos() {
		return usuarioRepository.findAll();
	}
	
	@GetMapping(path =  "/verPorId/{id}")
	public Optional<usuario> verPorId(@PathVariable int id){
		return usuarioRepository.findById(id);
		 
	}
	
	//Outra forma de fazer a listagem de retorno de todos
	//@GetMapping("/vertodos")
	//@ResponseBody
	//public ResponseEntity<List<usuario>> verTodos() {
	//	List<usuario> usuarios = (List<usuario>) usuarioRepository.findAll();
	//	return new ResponseEntity<List<usuario>>(usuarios, HttpStatus.OK);
	//}
	
	//@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	@PostMapping
	public @ResponseBody usuario novoUsuario(@RequestParam String nome, int idade) {
		usuario nusuario = new usuario(nome, idade);
		usuarioRepository.save(nusuario);
		return nusuario;		
	}
	
	@DeleteMapping
	@ResponseBody
	public usuario deleteUsuario(@RequestParam int id) {
		usuarioRepository.deleteById(id);
		return null;
	}
}
