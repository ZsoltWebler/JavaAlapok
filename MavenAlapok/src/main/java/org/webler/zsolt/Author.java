package org.webler.zsolt;

import java.util.ArrayList;
import java.util.List;


public class Author {

    private String name;
    private final List<Book> publishedBooks = new ArrayList<>();

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void addBook(Book book){
        this.publishedBooks.add(book);
    }
}
