package com.rafa.CRUD.CRUD.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.rafa.CRUD.CRUD.model.entities.usuario;

public interface UsuarioRepository extends PagingAndSortingRepository<usuario, Integer>{
	
	public Iterable<usuario> findByNomeContaining(String parteNome);
	
}
