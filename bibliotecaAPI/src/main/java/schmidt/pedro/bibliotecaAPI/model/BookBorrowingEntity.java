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
@Table(name = "book_borrowing")
public class BookBorrowingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowing_id")
    private long id;

    @NotBlank(message = "It can not be blank")
    @Column(name = "return_date")
    private String returnDate;

    @NotBlank(message = "It can not be blank")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "It can not be blank")
    @Column(name = "phone_number")
    private long phoneNumber;

    @NotBlank(message = "It can not be blank")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "It can not be blank")
    @Column(name = "book_id")
    private long bookId;

}
