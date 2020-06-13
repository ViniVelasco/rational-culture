package br.com.rationalculture.api.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PontuacaoModel {
	
	private CandidatoModel candidato;
	
	private BigDecimal media;

}
