package com.projeto.springbootswagger.apirest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

@Builder(toBuilder = true)
@Getter
@Setter
@Entity
@EqualsAndHashCode(callSuper = false)
public class AutoridadeAlcada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "co_autoridade")
	private Integer id;
	
	@Column(name = "nu_versao")
	private int nuVersao;
	
	@Column(name = "no_autoridade")
	private String noAutoriade;
	
	@Column(name = "de_codigos_funcao")
	private Integer deCodigosFuncao;
	
	@Tolerate
	public AutoridadeAlcada() {
		super();
	}
}
