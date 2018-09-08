package day1.test;

import java.util.HashSet;
import java.util.Set;

public class Author {
    private String name;
    private String lastName;
    private Set<Book> books = new HashSet<>();

    public Set<Book> getBooks() {
        return books;
    }

    public Author() {
    }

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void addBook(Book book) {
        books.add(book);
    }


}
