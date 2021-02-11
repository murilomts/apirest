package com.projeto.springbootswagger.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.springbootswagger.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	//Produto findById(long id);
}
