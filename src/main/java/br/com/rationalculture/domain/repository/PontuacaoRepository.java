package br.com.rationalculture.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rationalculture.domain.model.Candidato;
import br.com.rationalculture.domain.model.Pontuacao;

@Repository
public interface PontuacaoRepository extends JpaRepository<Pontuacao, Candidato> {
	
	@EntityGraph(attributePaths = {"candidato"})
	List<Pontuacao> findAll();
	
}