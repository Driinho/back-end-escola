package br.com.ifpr.escola.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.ifpr.escola.models.Professor;
import br.com.ifpr.escola.models.Views;
import br.com.ifpr.escola.repository.ProfessorRepository;

@RestController
@RequestMapping(value = "/postgres")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/professor")
    @JsonView(Views.Public.class)
    public List<Professor> buscarProfessor() {
        return professorRepository.findAll();
    }

    @GetMapping(path = "/professor/{id}")
    @JsonView(Views.Public.class)
    public Optional<Professor> buscaProfessorPorId(@PathVariable(name = "id", required = true) long id) {
        return professorRepository.findById(id);
    }

    @GetMapping(path = "/professor/login/{nomeDeUsuario}/{senha}")
    @JsonView(Views.Public.class)
    public Optional<Professor> autenticar(@PathVariable(name = "nomeDeUsuario", required = true) String nomeDeUsuario,
                                        @PathVariable(name = "senha", required = true) String senha) {

        return professorRepository.findByNomeDeUsuarioAndSenha(nomeDeUsuario, senha);
    }

    @PostMapping(path = "/professor/save")
    @JsonView(Views.Internal.class)
    public void salvaProfessor(@RequestBody Professor professor) {
        professorRepository.save(professor);
    }
}
