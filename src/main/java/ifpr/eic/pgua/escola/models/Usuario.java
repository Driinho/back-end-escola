package ifpr.eic.pgua.escola.models;

import java.time.LocalDate;

public class Usuario {

    protected int id;
    protected String nomeDeUsuario;
    protected String senha;
    protected String nome;
    protected LocalDate dataDeNascimento;

    public Usuario(int id, String nomeDeUsuario, String senha, String nome, LocalDate dataDeNascimento) {
        this.id = id;
        this.nomeDeUsuario = nomeDeUsuario;
        this.senha = senha;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Usuario(String nomeDeUsuario, String senha, String nome, LocalDate dataDeNascimento) {
        this.nomeDeUsuario = nomeDeUsuario;
        this.senha = senha;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
