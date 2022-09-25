package br.com.ifpr.escola.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpr.escola.models.Professor;
import br.com.ifpr.escola.repository.ProfessorRepository;

@RestController
@RequestMapping(value = "/postgres")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping(path = "/professor")
    public List<Professor> buscarProfessor() {
        return professorRepository.findAll();
    }

    @GetMapping(path = "/professor/{id}")
    public Optional<Professor> buscaProfessorPorId(@PathVariable(name = "id", required = true) long id) {
        return professorRepository.findById(id);
    }

    @GetMapping(path = "/professor/autenticar/{nomeDeUsuario}")
    public Optional<Professor> buscaPorNomeDeUsuario(
            @PathVariable(name = "nomeDeUsuario", required = true) String nomeDeUsuario) {
        return professorRepository.findByNomeDeUsuario(nomeDeUsuario);
    }

    @GetMapping(path = "/professor/autenticar/{nomeDeUsuario}/{senha}")
    public Optional<Professor> autenticar(@PathVariable(name = "nomeDeUsuario", required = true) String nomeDeUsuario,
            @PathVariable(name = "senha", required = true) String senha) {

        return professorRepository.findByNomeDeUsuarioAndSenha(nomeDeUsuario, senha);
    }
}
