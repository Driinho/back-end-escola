package ifpr.eic.pgua.escola.models;

import java.time.LocalDate;

public class Usuario {

    protected String nomeDeUsuario;
    protected String senha;
    protected String nome;
    protected int idade;
    protected LocalDate dataDeNascimento;

    public Usuario(String nomeDeUsuario, String senha, String nome, int idade, LocalDate dataDeNascimento) {
        this.nomeDeUsuario = nomeDeUsuario;
        this.senha = senha;
        this.nome = nome;
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
