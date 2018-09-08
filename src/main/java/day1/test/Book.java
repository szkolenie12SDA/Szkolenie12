package day1.test;


public class Book implements Comparable<Book> {
    private String title;
    private Author author;
    private Cover cover;

    public Book(String title, Author author, Cover cover) {
        this.title = title;
        this.author = author;
        this.cover = cover;
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "Tytul='" + title + '\'' +
                ", autor=" + author +
                ", okladka=" + cover.getName() +
                '}';
    }
}
