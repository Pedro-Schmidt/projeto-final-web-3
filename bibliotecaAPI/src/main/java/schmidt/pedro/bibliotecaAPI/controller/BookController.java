package schmidt.pedro.bibliotecaAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import schmidt.pedro.bibliotecaAPI.model.BookEntity;
import schmidt.pedro.bibliotecaAPI.repository.BookRepository;

import java.util.List;

/**
 * @author Pedro Schmidt
 */

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public ResponseEntity<List<BookEntity>> findAll() {
        return new ResponseEntity<List<BookEntity>>(
                (List<BookEntity>) this.bookRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<BookEntity> findById(@PathVariable("id") long id) {
        if (bookRepository.findById(id).isPresent()) {
            return new ResponseEntity<BookEntity>(
                    this.bookRepository.findById(id).get(), new HttpHeaders(), HttpStatus.OK);
        }
        return new ResponseEntity<BookEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<BookEntity> save(@RequestBody BookEntity bookEntity) {
        return new ResponseEntity<BookEntity>(this.bookRepository.save(bookEntity),
                new HttpHeaders(), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<BookEntity> update (@PathVariable("id") long id,
                                              @RequestBody BookEntity bookEntity) throws Exception {
        if (id == 0 || !this.bookRepository.existsById(id)) {
            throw new Exception("Invalid Id");
        }

        return new ResponseEntity<BookEntity>(this.bookRepository.save(bookEntity),
                new HttpHeaders(), HttpStatus.OK);

    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<BookEntity> delete(@PathVariable("id") long id) {
        this.bookRepository.deleteById(id);
        return new ResponseEntity<BookEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}
