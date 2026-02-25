package crud.Livros.livros.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Livraria")
public class Livraria {
    private String nomeLivraria;
    private String endereco;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "livraria", cascade = CascadeType.ALL)
    private List<Livro> livros;

    public Livraria(){

    }

    public String getNomeLivraria() {
        return nomeLivraria;
    }

    public void setNomeLivraria(String nomeLivraria) {
        this.nomeLivraria = nomeLivraria;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
