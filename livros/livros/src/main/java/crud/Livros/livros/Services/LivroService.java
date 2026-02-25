package crud.Livros.livros.Services;

import crud.Livros.livros.Entities.Livro;
import crud.Livros.livros.Repository.ILivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private final ILivroRepository rep;

    public LivroService(ILivroRepository rep) {
        this.rep = rep;
    }

    public Livro createLivro(Livro livro){
        return rep.save(livro);
    }

    public List<Livro> getAll(){
        return rep.findAll();
    }

    public Livro getById(Long id){
        Livro livroBuscado =  rep.findById(id).
                orElseThrow(() -> new RuntimeException("Livro nao encontrado"));
        return livroBuscado;
    }

    public void deleteBydId(Long id){
        rep.deleteById(id);
    }

    public Livro update(Long id, Livro livroEditado){
        Livro livroCriado = rep.findById(id).
                orElseThrow(() -> new RuntimeException("Livro não encontrado"));

        livroCriado.setNome(livroEditado.getNome());
        livroCriado.setAutor(livroEditado.getAutor());
        return livroEditado;
    }

}
