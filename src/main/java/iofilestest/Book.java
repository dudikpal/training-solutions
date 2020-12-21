package iofilestest;

import library.NullOrEmpty;

import java.util.Objects;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        NullOrEmpty.stringIsNullOrEmpty(author, "Name is empty or null!");
        NullOrEmpty.stringIsNullOrEmpty(title, "Title is empty or null!");
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getAuthor(), book.getAuthor()) &&
                Objects.equals(getTitle(), book.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getTitle());
    }

    @Override
    public String toString() {
        return "author= " + author +
                ", title= " + title;
    }


}
