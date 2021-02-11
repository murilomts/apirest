package com.projeto.springbootswagger.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.springbootswagger.apirest.models.Alcada;

@Repository
public interface AlcadaRepository extends JpaRepository<Alcada, Integer>{


}
