package br.com.rationalculture.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rationalculture.domain.model.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {

	
}	