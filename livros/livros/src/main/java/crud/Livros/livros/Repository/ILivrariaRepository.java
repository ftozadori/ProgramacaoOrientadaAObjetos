package crud.Livros.livros.Repository;

import crud.Livros.livros.Entities.Livraria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILivrariaRepository extends JpaRepository<Livraria, Long> {
}
