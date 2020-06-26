package schmidt.pedro.bibliotecaAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import schmidt.pedro.bibliotecaAPI.model.BookBorrowingEntity;
import schmidt.pedro.bibliotecaAPI.repository.BookBorrowingRepository;

import java.util.List;

/**
 * @author Pedro Schmidt
 */

@RestController
@RequestMapping("/borrow")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookBorrowingController {

    @Autowired
    private BookBorrowingRepository bookBorrowingRepository;

    @GetMapping
    public ResponseEntity<List<BookBorrowingEntity>> findAll() {
        return new ResponseEntity<List<BookBorrowingEntity>>(
                (List<BookBorrowingEntity>) this.bookBorrowingRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<BookBorrowingEntity> findById(@PathVariable("id") long id) {

        if (bookBorrowingRepository.findById(id).isPresent())
            return new ResponseEntity<BookBorrowingEntity>(
                    this.bookBorrowingRepository.findById(id).get(), new HttpHeaders(), HttpStatus.OK);
        return new ResponseEntity<BookBorrowingEntity>(HttpStatus.NOT_FOUND);

    }

    @PostMapping
    public ResponseEntity<BookBorrowingEntity> save(@RequestBody BookBorrowingEntity bookBorrowingEntity) {

        return new ResponseEntity<BookBorrowingEntity>(
                this.bookBorrowingRepository.save(bookBorrowingEntity),
                new HttpHeaders(), HttpStatus.CREATED);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<BookBorrowingEntity> update(@PathVariable("id") long id,
                                               @RequestBody BookBorrowingEntity bookBorrowingEntity) throws Exception {

        if (id == 0 || !this.bookBorrowingRepository.existsById(id)) {
            throw new Exception("Código não encontrado ou inexistente!");
        }

        return new ResponseEntity<BookBorrowingEntity>(
                this.bookBorrowingRepository.save(bookBorrowingEntity),
                new HttpHeaders(), HttpStatus.OK);

    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<BookBorrowingEntity> delete(@PathVariable("id") long id) {

        this.bookBorrowingRepository.deleteById(id);
        return new ResponseEntity<BookBorrowingEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}
