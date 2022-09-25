package br.com.ifpr.escola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpr.escola.models.Aluno;
import br.com.ifpr.escola.repository.AlunoRepository;

@RestController
@RequestMapping("/postgres")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping(path = "/aluno")
    public List<Aluno> buscarAlunos() {
        return alunoRepository.findAll();
    }
}
