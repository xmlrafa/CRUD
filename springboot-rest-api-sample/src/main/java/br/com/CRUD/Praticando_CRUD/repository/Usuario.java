package br.com.CRUD.Praticando_CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuario  extends JpaRepository<Usuario, Long>{

}
