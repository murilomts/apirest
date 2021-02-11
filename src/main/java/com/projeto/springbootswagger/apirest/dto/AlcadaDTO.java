package com.projeto.springbootswagger.apirest.dto;

import com.projeto.springbootswagger.apirest.models.Alcada;
import com.projeto.springbootswagger.apirest.models.AutoridadeAlcada;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

@Builder
@Getter
@Setter
public class AlcadaDTO {
	
	private Integer id;
	private AutoridadeAlcada autoridadeAlcada;
	private Integer nuVersao;
	private Double vrFinal;
	
	
	@Tolerate
	public AlcadaDTO(Alcada alcada) {
		id = alcada.getId();
		autoridadeAlcada = alcada.getAutoridadeAlcada();
		nuVersao = alcada.getNuVersao();
		vrFinal = alcada.getVrFinal();
	}

}
