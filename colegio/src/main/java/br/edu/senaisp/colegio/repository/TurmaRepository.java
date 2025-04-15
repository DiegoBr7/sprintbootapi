package br.edu.senaisp.colegio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.senaisp.colegio.model.Turma;

@Repository
public interface TurmaRepository
           extends JpaRepository<Turma, Long>{
	//https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#jpa.query-methods.at-query
	
	//1. Derived Query Methods
	List<Turma> findByNome(String nome);
	long countByNome(String nome);
	List<Turma> findByNomeContains(String nome);
	List<Turma> findByNomeNotContains(String nome);
	Optional<Turma> findFirstByNome(String nome);
	Optional<Turma> findLastByNome(String nome);
	List<Turma> findByNomeAndId(String nome, Long id);
	
	

}
