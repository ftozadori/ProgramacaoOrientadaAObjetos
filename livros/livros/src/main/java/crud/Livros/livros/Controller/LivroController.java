package crud.Livros.livros.Controller;

import crud.Livros.livros.Entities.Livro;
import crud.Livros.livros.Services.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")

public class LivroController {

    private final LivroService serv;


    public LivroController(LivroService serv) {
        this.serv = serv;
    }

    @PostMapping
    public ResponseEntity<Livro> createLivro(@RequestBody Livro livro){
        return new ResponseEntity<>(serv.createLivro(livro), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Livro>> getAll(){
        return new ResponseEntity<>(serv.getAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity <Livro> getById(@PathVariable Long id) {
        return new ResponseEntity<>(serv.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <Livro> deleteBydId(@PathVariable Long id) {
        serv.deleteBydId(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public ResponseEntity <Livro> update(@PathVariable Long id, @RequestBody Livro livro) {
        serv.update(id, livro);
        return ResponseEntity.ok().build();
    }
}
