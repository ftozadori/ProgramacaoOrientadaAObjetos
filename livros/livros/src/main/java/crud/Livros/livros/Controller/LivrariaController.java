package crud.Livros.livros.Controller;

import crud.Livros.livros.Entities.Livraria;
import crud.Livros.livros.Services.LivrariaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livraria")

public class LivrariaController {

    private final LivrariaService serv;

    public LivrariaController(LivrariaService serv) {
        this.serv = serv;
    }

    @PostMapping
    public ResponseEntity<Livraria> createLivro(@RequestBody Livraria livraria){
        return new ResponseEntity<>(serv.createLivro(livraria), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Livraria>> getAll(){
        return new ResponseEntity<>(serv.getAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity <Livraria> getById(@PathVariable Long id) {
        return new ResponseEntity<>(serv.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity <Livraria> deleteBydId(@PathVariable Long id) {
        serv.deleteBydId(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public ResponseEntity <Livraria> update(@PathVariable Long id, @RequestBody Livraria livraria) {
        serv.update(id, livraria);
        return ResponseEntity.ok().build();
    }
}
