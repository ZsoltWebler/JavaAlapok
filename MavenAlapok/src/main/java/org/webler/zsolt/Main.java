package org.webler.zsolt;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Author author = new Author("Robert C. Martin");

        Book clean_code = new Book(
                "Clean Code",
                "Code is clean if it can be understood easily – by everyone on the team. Clean code can be read and enhanced by a developer other than its original author. With understandability comes readability, changeability, extensibility and maintainability.",
                "9788175257665",
                LocalDate.now(),
                500,
                author);

        Book clean_architecture = new Book(
                "Clean Code",
                "Clean architecture is a software design philosophy that separates the elements of a design into ring levels. An important goal of clean architecture is to provide developers with a way to organize code in such a way that it encapsulates the business logic but keeps it separate from the delivery mechanism.",
                "9788175257665",
                LocalDate.now(),
                500,
                author);



    }
}