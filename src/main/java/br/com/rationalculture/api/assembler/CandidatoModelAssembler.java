package br.com.rationalculture.api.assembler;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rationalculture.api.model.CandidatoModel;
import br.com.rationalculture.domain.model.Candidato;

@Component
public class CandidatoModelAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public CandidatoModel toModel(Candidato candidato) {
		return modelMapper.map(candidato, CandidatoModel.class);
	}
	
	public List<CandidatoModel> toCollectionModel(List<Candidato> candidatos) {
		return candidatos.stream()
				.map(candidato -> toModel(candidato))
				.collect(Collectors.toList());
	}

}
