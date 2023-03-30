package org.webler.zsolt;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Getter
@Setter
public class Author {

    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
    private String name;
    private final List<Book> publishedBooks = new ArrayList<>();
    public Author(String name){
        this.name = name;
    }


    public void addBook(Book book) {
        this.publishedBooks.add(book);
    }
}
