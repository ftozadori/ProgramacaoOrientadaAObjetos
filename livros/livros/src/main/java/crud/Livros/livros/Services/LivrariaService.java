package crud.Livros.livros.Services;

import crud.Livros.livros.Entities.Livraria;
import crud.Livros.livros.Repository.ILivrariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrariaService {

    @Autowired
    private final ILivrariaRepository rep;

    public LivrariaService(ILivrariaRepository rep) {
        this.rep = rep;
    }

    public Livraria createLivro(Livraria livraria){
        return rep.save(livraria);
    }

    public List<Livraria> getAll(){
        return rep.findAll();
    }

    public Livraria getById(Long id){
        Livraria livrariaBuscada =  rep.findById(id).
                orElseThrow(() -> new RuntimeException("Livraria nao encontrada"));
        return livrariaBuscada;
    }

    public void deleteBydId(Long id){
        rep.deleteById(id);
    }

    public Livraria update(Long id, Livraria livrariaEditada){
        Livraria livrariaCriada = rep.findById(id).
                orElseThrow(() -> new RuntimeException("Livraria não encontrada"));

        livrariaCriada.setNomeLivraria(livrariaEditada.getNomeLivraria());
        livrariaCriada.setEndereco(livrariaEditada.getEndereco());
        return livrariaEditada;
    }
}
