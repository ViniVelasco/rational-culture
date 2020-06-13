package br.com.rationalculture.domain.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rationalculture.api.model.CandidatoModel;
import br.com.rationalculture.api.model.PontuacaoModel;
import br.com.rationalculture.core.modelmapper.CustomComparator;
import br.com.rationalculture.domain.model.Pontuacao;
import br.com.rationalculture.domain.repository.PontuacaoRepository;

@Service
public class PontuacaoService {

	@Autowired
	private PontuacaoRepository pontuacaoRepository;
	
	public List<PontuacaoModel> getPontuacoes() {
		
		List<Pontuacao> pontuacoes = pontuacaoRepository.findAll();
		List<PontuacaoModel> pontuacaoModel = new ArrayList<PontuacaoModel>();
		
		for(Pontuacao p: pontuacoes) {
			PontuacaoModel pm = new PontuacaoModel();
			
			pm.setCandidato(new CandidatoModel());
			pm.getCandidato().setNome(p.getCandidato().getNome());
			pm.setMedia(p.calcularMedia(p.getMatematica(), p.getBiologia(), p.getProjeto()));
			pontuacaoModel.add(pm);
		}
		
		Collections.sort(pontuacaoModel, new CustomComparator());
		
		
		
		return pontuacaoModel;
		
	}
}
