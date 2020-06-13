package br.com.rationalculture.api.assembler;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rationalculture.api.model.PontuacaoModel;
import br.com.rationalculture.domain.model.Pontuacao;

@Component
public class PontuacaoModelAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public PontuacaoModel toModel(Pontuacao pontuacao) {
		return modelMapper.map(pontuacao, PontuacaoModel.class);
	}
	
	public List<PontuacaoModel> toCollectionModel(List<Pontuacao> pontuacoes) {
		return pontuacoes.stream()
				.map(pontuacao -> toModel(pontuacao))
				.collect(Collectors.toList());
	}

}
