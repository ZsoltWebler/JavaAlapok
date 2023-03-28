package org.webler.zsolt;

import java.time.LocalDate;


public class Book {

    private String name;
    private String description;
    private String isbn;
    private LocalDate publicationDate;
    private int printLength;
    private Author author;

    public Book() {

    }

    public Book(String name, String description, String isbn, LocalDate publicationDate, int printLength, Author author) {
        this.name = name;
        this.description = description;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
        this.printLength = printLength;
        setAuthor(author);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPrintLength() {
        return printLength;
    }

    public void setPrintLength(int printLength) {
        this.printLength = printLength;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
        author.addBook(this);
    }
}
