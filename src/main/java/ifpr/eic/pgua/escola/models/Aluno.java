package ifpr.eic.pgua.escola.models;

import java.time.LocalDate;

public class Aluno extends Usuario {

    private String matricula;

    public Aluno(String nomeDeUsuario, String senha, String nome, int idade, LocalDate dataDeNascimento,
            String matricula) {
        super(nomeDeUsuario, senha, nome, idade, dataDeNascimento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return matricula;
    }
}
