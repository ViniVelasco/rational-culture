package br.com.rationalculture.domain.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Pontuacao {
	
	@Id
	private Long candidatoId;

	
	@OneToOne
	@MapsId
    @JoinColumn(name = "candidato_id")
	private Candidato candidato;
		
	private Double matematica;
	
	private Double biologia;

	private Double projeto;
	
	
	public BigDecimal calcularMedia(Double matematica, Double biologia, Double projeto) {
		Double media = ((matematica * 2) + (biologia * 3) + (projeto * 5)) / 10;
		
		BigDecimal mediaBig = new BigDecimal(media);
		
		return mediaBig.setScale(2, RoundingMode.HALF_EVEN);
	}

}
