package com.example.Prova.Repository;

import com.example.Prova.Entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository <Curso, Long> {
}
