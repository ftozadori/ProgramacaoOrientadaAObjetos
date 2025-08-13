package com.festa.festa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/usuarios")
public class UsuarioController {

    @Autowired
    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Usuario> salvarPessoa(@RequestBody Usuario usuario){
        return new ResponseEntity<>(service.salvarPessoa(usuario), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> buscarPessoas() {
        return ResponseEntity.ok(service.buscarPessoas());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deletarPessoa(@PathVariable Long id){
        this.service.deletarPessoar(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> editarPessoar(@PathVariable Long id, Usuario usuario) throws Exception {
        this.service.editarUsuario(id, usuario);
        return ResponseEntity.ok().build();
    }
}
