package com.rafa.CRUD.CRUD.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

		return new usuario(1, "Rafa", 28);
	}

}
