package ifpr.eic.pgua.escola.models;

import java.util.Date;

public class Professor extends Usuario {

    private double salario;

    public Professor(String nomeDeUsuario, String senha, String nome, int idade, Date dataDeNascimento,
            double salario) {
        super(nomeDeUsuario, senha, nome, idade, dataDeNascimento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
