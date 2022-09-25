package br.com.ifpr.escola.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ifpr.escola.models.Professor;
import br.com.ifpr.escola.repository.ProfessorRepository;

public class CadastroProfessor {

    @Autowired
    private ProfessorRepository professorRepository;

    public void cadastro(Professor professor) {
        professorRepository.saveAndFlush(professor);
    }
}
