package com.example.Prova.Api;

import com.example.Prova.Entities.Aluno;
import com.example.Prova.Service.AlunoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping ("/alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @Operation
    @PostMapping
    public ResponseEntity<Aluno> addAluno(@RequestBody Aluno aluno){
        return new ResponseEntity<>(service.addAluno(aluno), HttpStatus.OK);
    }

    @Operation
    @GetMapping
    public ResponseEntity<List<Aluno>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @Operation
    @GetMapping("{id}")
    public ResponseEntity <Aluno> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @Operation
    @DeleteMapping("{id}")
    public ResponseEntity <Aluno> Delete(@PathVariable Long id) {
        service.deleteBydId(id);
        return ResponseEntity.ok().build();
    }

    @Operation
    @PutMapping("{id}")
    public ResponseEntity <Aluno> update(@PathVariable Long id, @RequestBody Aluno aluno) {
        service.updateAluno(id, aluno);
        return ResponseEntity.ok().build();
    }
}
