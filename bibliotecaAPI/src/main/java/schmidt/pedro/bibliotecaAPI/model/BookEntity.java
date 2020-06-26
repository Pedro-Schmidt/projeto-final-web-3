package schmidt.pedro.bibliotecaAPI.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author Pedro Schmidt
 */

//Lombok
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString

//SpringBoot
@Component

//JPA
@Entity
@Table(name = "books")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long id;

    @NotBlank(message = "It can not be blank")
    @Column(name = "book_name")
    private String bookName;

    @NotBlank(message = "It can not be blank")
    @Column(name = "book_author")
    private String author;

    @Column(name = "book_illustrator")
    private String illustrator;

    @Column(name = "book_isbn")
    private String isbn;

    @NotBlank(message = "It can not be blank")
    @Column(name = "book_pages")
    private int pages;

}
