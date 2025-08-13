package com.festa.festa;

import jakarta.persistence.*;

@Entity
@Table (name = "Usuario")
public class Usuario {
    private String nome;
    private int idade;

    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    public Usuario(){

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
