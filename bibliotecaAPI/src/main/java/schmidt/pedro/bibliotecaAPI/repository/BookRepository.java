package schmidt.pedro.bibliotecaAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import schmidt.pedro.bibliotecaAPI.model.BookEntity;

/**
 * @author Pedro Schmidt
 */

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long> {
}
