package com.example.Prova.Service;


import com.example.Prova.Entities.Aluno;
import com.example.Prova.Repository.IAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private final IAlunoRepository rep;

    public AlunoService(IAlunoRepository rep) {
        this.rep = rep;
    }

    public Aluno addAluno(Aluno aluno){
        return rep.save(aluno);
    }

    public List<Aluno> getAll(){
        return rep.findAll();
    }

    public Aluno getById(Long id){
        Aluno alunoBuscado = rep.findById(id).
                orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        return alunoBuscado;
    }

    public void deleteBydId(Long id){
        rep.deleteById(id);
    }

    public Aluno updateAluno (Long id, Aluno alunoEditado){
        Aluno alunoCriado = rep.findById(id).
                orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        alunoCriado.setCurso(alunoEditado.getCurso());
        alunoCriado.setNome(alunoEditado.getNome());
        alunoCriado.setMatricula(alunoEditado.getMatricula());
        alunoCriado.setStatus(alunoEditado.getStatus());

        return alunoEditado;
    }
}

