package com.projeto.springbootswagger.apirest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Alcada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "co_alcada")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "co_autoridade")
	private AutoridadeAlcada autoridadeAlcada;
	
	@Column(name = "nu_versao")
	private Integer nuVersao;
	
	@Column(name = "vr_final")
	private Double vrFinal;
	
	@Tolerate
	public Alcada() {
		super();
	}
}
