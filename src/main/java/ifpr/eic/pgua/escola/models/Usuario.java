package ifpr.eic.pgua.escola.models;

import java.util.Date;

public class Usuario {

    private String nomeDeUsuario;
    private String senha;
    private String nome;
    private int idade;
    private Date dataDeNascimento;

    public Usuario(String nomeDeUsuario, String senha, String nome, int idade, Date dataDeNascimento) {
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

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
