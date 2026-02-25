package crud.Livros.livros.Repository;

import crud.Livros.livros.Entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILivroRepository extends JpaRepository<Livro, Long> {
}
