package org.webler.zsolt;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.Valid;
import jakarta.validation.executable.ExecutableType;
import jakarta.validation.executable.ValidateOnExecution;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@ValidateOnExecution(type = ExecutableType.ALL)
public class Book {

    private String name;
    private String description;
    private String isbn;
    private LocalDate publicationDate;
    private int printLength;
    @JsonIgnore
    @Valid
    private Author author;

    public Book(String name, String description, String isbn, LocalDate publicationDate, int printLength, @Valid Author author) {
        this.name = name;
        this.description = description;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
        this.printLength = printLength;
        setAuthor(author);
    }

    public void setAuthor(Author author) {
        this.author = author;
        author.addBook(this);
    }
}
