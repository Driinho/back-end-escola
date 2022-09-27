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
import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;

@Data
@Entity
@Table(name = "aluno")
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(Views.Public.class)
    private Long id;

    @JsonIgnore
    @Column(name = "nome_de_usuario")
    @JsonView(Views.Internal.class)
    private String nomeDeUsuario;

    @JsonIgnore
    @Column(name = "senha")
    @JsonView(Views.Internal.class)
    private String senha;

    @Column(name = "nome")
    @JsonView(Views.Public.class)
    private String nome;

    @Column(name = "data_de_nascimento")
    @JsonView(Views.Public.class)
    private LocalDate dataDeNascimento;

    @Column(name = "matricula")
    @JsonView(Views.Public.class)
    private String matricula;
}
