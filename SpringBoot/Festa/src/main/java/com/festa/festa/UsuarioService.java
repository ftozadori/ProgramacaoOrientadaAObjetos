package com.festa.festa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> buscarPessoas() {
         return repository.findAll();
    }

    public Usuario salvarPessoa(Usuario pessoa) {
        repository.save(pessoa);
        return pessoa;
    }

    public void deletarPessoar(Long id){
        repository.deleteById(id);
    }

    public Usuario editarUsuario(Long id, Usuario usuarioEditado) throws Exception {
        Usuario usuarioExistente  = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("usuario não encontrado"));
         usuarioExistente.setNome(usuarioEditado.getNome());
         usuarioExistente.setIdade(usuarioEditado.getIdade());
         return usuarioExistente;
    }
}
