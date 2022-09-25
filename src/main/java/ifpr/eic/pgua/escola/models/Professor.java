package ifpr.eic.pgua.escola.models;

import java.time.LocalDate;

public class Professor extends Usuario {

    private double salario;

    public Professor(int id, String nomeDeUsuario, String senha, String nome, LocalDate dataDeNascimento,
            double salario) {
        super(id, nomeDeUsuario, senha, nome, dataDeNascimento);
        this.salario = salario;
    }

    public Professor(String nomeDeUsuario, String senha, String nome, LocalDate dataDeNascimento,
            double salario) {
        super(nomeDeUsuario, senha, nome, dataDeNascimento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String str = "Data de Nascimento" + dataDeNascimento;
        return str;
    }
}
