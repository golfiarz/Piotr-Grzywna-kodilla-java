package com.kodilla.testing.forum.statistics.library;

public class Book {
    String title;
    String author;
    int publictionYear;

    public Book(String title, String author, int publictionYear) {
        this.title = title;
        this.author = author;
        this.publictionYear = publictionYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublictionYear() {
        return publictionYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publictionYear=" + publictionYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (publictionYear != book.publictionYear) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return author != null ? author.equals(book.author) : book.author == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + publictionYear;
        return result;
    }
}

