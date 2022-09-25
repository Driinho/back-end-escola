package br.com.ifpr.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifpr.escola.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
