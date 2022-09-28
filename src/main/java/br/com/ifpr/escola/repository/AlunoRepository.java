package br.com.ifpr.escola.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifpr.escola.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Optional<Aluno> findByNomeDeUsuario(String nomeDeUsuario);

    Optional<Aluno> findByNomeDeUsuarioAndSenha(String nomeDeUsuario, String senha);
}
