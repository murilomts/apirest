package com.projeto.springbootswagger.apirest.resource;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.springbootswagger.apirest.dto.AlcadaDTO;
import com.projeto.springbootswagger.apirest.models.Alcada;
import com.projeto.springbootswagger.apirest.repository.AlcadaRepository;
import com.projeto.springbootswagger.apirest.service.AlcadaService;
import com.sun.el.stream.Optional;

@RestController
@RequestMapping("/alcada")
public class AlcadaController {
	
	@Autowired
	private AlcadaRepository alcadaRepository;
	
	@Autowired
	AlcadaService alcadaService;
	
	@GetMapping("/buscaLista")
	public List<Alcada> listar() {
		return alcadaRepository.findAll();
	}
	
	@GetMapping("/buscaAlcada/{id}")
	public AlcadaDTO buscarPorId(@PathVariable Integer id){
		return alcadaService.buscarPorId(id);
	}
	
	@PostMapping("/salvaAlcasa")
	public ResponseEntity<Alcada> adicionar(@RequestBody AlcadaDTO dto) {
		Alcada retorno = alcadaService.salvar(dto);
		return retorno != null ? ResponseEntity.ok(retorno)
				: new ResponseEntity<>(HttpStatus.NON_AUTHORITATIVE_INFORMATION);
	}
	
}
