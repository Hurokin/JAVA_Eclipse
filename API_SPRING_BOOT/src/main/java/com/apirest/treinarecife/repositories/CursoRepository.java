package com.apirest.treinarecife.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.treinarecife.entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
