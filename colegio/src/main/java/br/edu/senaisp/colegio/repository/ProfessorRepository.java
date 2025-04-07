package br.edu.senaisp.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.senaisp.colegio.model.Professor;

@Repository
public interface ProfessorRepository
	extends JpaRepository<Professor, Long>{

}
