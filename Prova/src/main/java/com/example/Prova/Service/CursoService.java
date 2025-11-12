package com.example.Prova.Service;


import com.example.Prova.Entities.Curso;
import com.example.Prova.Repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private final ICursoRepository rep;

    public CursoService(ICursoRepository rep) {
        this.rep = rep;
    }

    public Curso addCurso(Curso Curso){
        return rep.save(Curso);
    }

    public List<Curso> getAll(){
        return rep.findAll();
    }

    public Curso getById(Long id){
        Curso CursoBuscado = rep.findById(id).
                orElseThrow(() -> new RuntimeException("Curso não encontrado"));
        return CursoBuscado;
    }

    public void deleteBydId(Long id){
        rep.deleteById(id);
    }

    public Curso updateCurso (Long id, Curso CursoEditado){
        Curso CursoCriado = rep.findById(id).
                orElseThrow(() -> new RuntimeException("Curso não encontrado"));

        CursoCriado.setAlunos(CursoEditado.getAlunos());
        CursoCriado.setNome(CursoEditado.getNome());
        CursoCriado.setCargaHoraria(CursoEditado.getCargaHoraria());

        return CursoEditado;
    }
}

