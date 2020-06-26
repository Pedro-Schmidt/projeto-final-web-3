package schmidt.pedro.bibliotecaAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import schmidt.pedro.bibliotecaAPI.model.BookBorrowingEntity;

/**
 * @author Pedro Schmidt
 */

@Repository
public interface BookBorrowingRepository extends CrudRepository<BookBorrowingEntity, Long> {
}
