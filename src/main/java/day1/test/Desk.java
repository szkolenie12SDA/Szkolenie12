package day1.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desk {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
       books.add(b);
    }
    public String getBooks() {
       List<Book> tempBooks = new ArrayList<>(books);
        Collections.sort(tempBooks);
        StringBuilder name = new StringBuilder();
        for (Book oneBook : tempBooks) {
            name.append(oneBook).append('\n');
        }


        return name.toString();
    }
    public void removeBook(Book book) throws BookNotExistOnTheDesk {
        if(books.contains(book)){
            books.remove(book);
        }else {
            throw new BookNotExistOnTheDesk();
        }
    }
}
