package ifpr.eic.pgua.escola.models;

import java.time.LocalDate;

public class Aluno extends Usuario {

    private String matricula;

    public Aluno(int id, String nomeDeUsuario, String senha, String nome, LocalDate dataDeNascimento,
            String matricula) {
        super(id, nomeDeUsuario, senha, nome, dataDeNascimento);
        this.matricula = matricula;
    }

    public Aluno(String nomeDeUsuario, String senha, String nome, LocalDate dataDeNascimento,
            String matricula) {
        super(nomeDeUsuario, senha, nome, dataDeNascimento);
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
