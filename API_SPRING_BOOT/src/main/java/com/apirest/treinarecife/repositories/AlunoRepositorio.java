package com.apirest.treinarecife.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apirest.treinarecife.entities.Aluno;

@Repository
public interface AlunoRepositorio extends CrudRepository<Aluno, Long>{

}
