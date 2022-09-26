package br.com.ifpr.escola.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name = "aluno")
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonIgnore
    @Column(name = "nome_de_usuario")
    private String nomeDeUsuario;

    @JsonIgnore
    @Column(name = "senha")
    private String senha;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_de_nascimento")
    private LocalDate dataDeNascimento;

    @Column(name = "matricula")
    private String matricula;
}
