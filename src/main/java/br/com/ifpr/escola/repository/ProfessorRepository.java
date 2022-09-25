package br.com.ifpr.escola.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifpr.escola.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    Optional<Professor> findByNomeDeUsuario(String nomeDeUsuario);

    Optional<Professor> findByNomeDeUsuarioAndSenha(String nomeDeUsuario, String senha);
}
