package com.example.Prova.Entities;

import jakarta.persistence.*;

@Entity
@Table (name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String matricula;
    Status status;
    @ManyToOne
    Curso curso;

    public Aluno() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
