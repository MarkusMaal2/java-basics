package week6;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book b) {
        this.books.add(b);
    }

    public void printBooks() {
        for (Book b : this.books) {
            System.out.println(b.toString());
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book b : this.books) {
            if (StringUtils.included(b.title(), title)) {
                found.add(b);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book b : this.books) {
            if (StringUtils.included(b.publisher(), publisher)) {
                found.add(b);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book b : this.books) {
            if (b.year() == year) {
                found.add(b);
            }
        }
        return found;
    }
}
