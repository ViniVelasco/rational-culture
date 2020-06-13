package br.com.rationalculture.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rationalculture.api.assembler.CandidatoModelAssembler;
import br.com.rationalculture.api.model.CandidatoModel;
import br.com.rationalculture.domain.model.Candidato;
import br.com.rationalculture.domain.repository.CandidatoRepository;

@RestController
@RequestMapping(value = "/candidatos", produces = MediaType.APPLICATION_JSON_VALUE)
public class CandidatoController {
	
	@Autowired
	private CandidatoModelAssembler candidatoModelAssembler;
	
	@Autowired
	private CandidatoRepository candidatoRepository;
	

	@GetMapping
	public Page<CandidatoModel> list(@PageableDefault(size = 10) Pageable pageable) {
		Page<Candidato> candidatosPage = candidatoRepository.findAll(pageable);
		
		List<CandidatoModel> candidatosModel = candidatoModelAssembler
				.toCollectionModel(candidatosPage.getContent());
		
		Page<CandidatoModel> candidatosPageModel = new PageImpl<>(candidatosModel, pageable, 
				candidatosPage.getTotalElements());
		
		return candidatosPageModel;
	}
	

}
