package br.com.rationalculture.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rationalculture.api.model.PontuacaoModel;
import br.com.rationalculture.domain.service.PontuacaoService;

@RestController
@RequestMapping(value = "/pontuacoes", produces = MediaType.APPLICATION_JSON_VALUE)
public class PontuacaoController {
	
	@Autowired
	private PontuacaoService pontuacaoService;
	

	@GetMapping
	public List<PontuacaoModel> listar(@PageableDefault(size = 10) Pageable pageable) {	
		List<PontuacaoModel> pontuacoesModel = pontuacaoService.getPontuacoes();
		
		return pontuacoesModel;
	}
	

}
