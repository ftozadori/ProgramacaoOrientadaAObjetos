package crud.Livros.livros.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Livro")
public class Livro {
    private String nome;
    private  String  autor;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "livraria_id")
    private Livraria livraria;

    public Livro (){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
