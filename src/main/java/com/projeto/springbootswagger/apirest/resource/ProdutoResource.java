package com.projeto.springbootswagger.apirest.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.springbootswagger.apirest.models.Produto;
import com.projeto.springbootswagger.apirest.repository.ProdutoRepository;

@RestController
@RequestMapping("/api")
public class ProdutoResource {
	
	@Autowired
	ProdutoRepository produtoRepo;
	
	@GetMapping("/produtos")
	public List<Produto> listaProdutos(){
		return produtoRepo.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Optional<Produto> listaProdutoUnico(@PathVariable(value="id") long id) {
		return produtoRepo.findById(id);
	}
}
