package br.com.ifpr.escola.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;

@Data
@Entity
@Table(name = "professor")
public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(Views.Public.class)
    private Long id;

    @JsonView(Views.Internal.class)
    @Column(name = "nome_de_usuario")
    private String nomeDeUsuario;

    // @JsonIgnore
    @JsonView(Views.Internal.class)
    @Column(name = "senha")
    private String senha;

    @JsonView(Views.Public.class)
    @Column(name = "nome")
    private String nome;

    @JsonView(Views.Public.class)
    @Column(name = "data_de_nascimento")
    private LocalDate dataDeNascimento;

    @JsonView(Views.Public.class)
    @Column(name = "salario")
    private Double salario;
}
