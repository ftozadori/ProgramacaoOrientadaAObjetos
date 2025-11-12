package com.example.Prova.Api;

import com.example.Prova.Entities.Curso;
import com.example.Prova.Service.CursoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping ("/Cursos")
public class CursoController {

    private final CursoService service;

    public CursoController(CursoService service) {
        this.service = service;
    }

    @Operation
    @PostMapping
    public ResponseEntity<Curso> addCurso(@RequestBody Curso Curso){
        return new ResponseEntity<>(service.addCurso(Curso), HttpStatus.OK);
    }

    @Operation
    @GetMapping
    public ResponseEntity<List<Curso>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @Operation
    @GetMapping("{id}")
    public ResponseEntity <Curso> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @Operation
    @DeleteMapping("{id}")
    public ResponseEntity <Curso> Delete(@PathVariable Long id) {
        service.deleteBydId(id);
        return ResponseEntity.ok().build();
    }

    @Operation
    @PutMapping("{id}")
    public ResponseEntity <Curso> update(@PathVariable Long id, @RequestBody Curso Curso) {
        service.updateCurso(id, Curso);
        return ResponseEntity.ok().build();
    }
}
