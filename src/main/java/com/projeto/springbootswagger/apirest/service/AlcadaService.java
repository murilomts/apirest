package com.projeto.springbootswagger.apirest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.springbootswagger.apirest.dto.AlcadaDTO;
import com.projeto.springbootswagger.apirest.models.Alcada;
import com.projeto.springbootswagger.apirest.repository.AlcadaRepository;

@Service
public class AlcadaService {
	
	@Autowired
	AlcadaRepository alcadaRepository;
	
	public AlcadaDTO buscarPorId(Integer id) {
		return new AlcadaDTO(alcadaRepository.findById(id).get());
	}
	
	public Alcada salvar(AlcadaDTO dto) {
		if(buscarPorId(dto.getId())  == null) {
			Alcada alcada = alcadaRepository.save(
					Alcada.builder()
					.id(dto.getId())
					.autoridadeAlcada(dto.getAutoridadeAlcada())
					.vrFinal(dto.getVrFinal()).build());
			return alcada;
		}
		
		return null;
	}

}
