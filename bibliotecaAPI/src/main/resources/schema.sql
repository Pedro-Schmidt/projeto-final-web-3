DROP TABLE IF EXISTS books;

CREATE TABLE books (
    book_id BIGINT AUTO_INCREMENT NOT NULL,
    book_name VARCHAR(250) NOT NULL,
    book_author VARCHAR(250) NOT NULL,
    book_illustrator VARCHAR(250),
    book_isbn VARCHAR(18),
    book_pages INT NOT NULL,
    PRIMARY KEY (book_id));

DROP TABLE IF EXISTS book_borrowing;

CREATE TABLE book_borrowing (
    borrowing_id BIGINT AUTO_INCREMENT NOT NULL,
    return_date VARCHAR(10) NOT NULL,
    name VARCHAR(150) NOT NULL,
    phone_number BIGINT NOT NULL,
    email VARCHAR(250) NOT NULL,
    book_id BIGINT NOT NULL,
    PRIMARY KEY (borrowing_id));