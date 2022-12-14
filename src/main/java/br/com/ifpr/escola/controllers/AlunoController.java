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

import br.com.ifpr.escola.models.Aluno;
import br.com.ifpr.escola.models.Views;
import br.com.ifpr.escola.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    @JsonView(Views.Public.class)
    public List<Aluno> buscarAlunos() {
        return alunoRepository.findAll();
    }

    @GetMapping(path = "/buscar/{id}")
    @JsonView(Views.Public.class)
    public Optional<Aluno> buscarAlunoPorId(@PathVariable(name = "id", required = true) long id) {
        return alunoRepository.findById(id);
    }

    @GetMapping(path = "/buscar/{nomeDeUsuario}")
    @JsonView(Views.Public.class)
    public Optional<Aluno> buscarAlunoPorNomeDeUsuario(@PathVariable(name = "nomeDeUsuario", required = true) String nomeDeUsuario) {
        return alunoRepository.findByNomeDeUsuario(nomeDeUsuario);
    }


    @GetMapping(path = "/login/{nomeDeUsuario}/{senha}")
    @JsonView(Views.Public.class)
    public Optional<Aluno> autenticar(@PathVariable(name = "nomeDeUsuario", required = true) String nomeDeUsuario,
                                    @PathVariable(name = "senha", required = true) String senha) {
        return alunoRepository.findByNomeDeUsuarioAndSenha(nomeDeUsuario, senha);
    }

    @PostMapping(path = "/save")
    @JsonView(Views.Internal.class)
    public void cadastraAluno(@RequestBody Aluno aluno) {
        alunoRepository.save(aluno);
    }
}
