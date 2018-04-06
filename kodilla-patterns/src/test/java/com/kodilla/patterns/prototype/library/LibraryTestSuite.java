package com.kodilla.patterns.prototype.library;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library booksRented = new Library("Rented books");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> booksRented.getBooks().add(new Book( "Title " + n, "Author " + n, LocalDate.of(1995 , 12 , 1))));

        Library booksAvailable = new Library("Available books");
        IntStream.iterate(1, n -> n + 10)
                .limit(10)
                .forEach(n -> booksAvailable.getBooks().add(new Book("Title " + n, "Author " + n, LocalDate.of(1988, 1, 1))));

        Library clonedBooksRented = null;
        try {
            clonedBooksRented = booksRented.shallowCopy();
            clonedBooksRented.setName("Rented books 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library clonedBooksAvaiable = null;
        try {
            clonedBooksAvaiable = booksAvailable.shallowCopy();
            clonedBooksAvaiable.setName("Available books 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedBooksRented = null;
        try {
            deepClonedBooksRented = booksRented.deepCopy();
            deepClonedBooksRented.setName("Rented books 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedBooksAvailable = null;
        try {
            deepClonedBooksAvailable = booksAvailable.deepCopy();
            deepClonedBooksAvailable.setName("Available books 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        Book someBook1 = new Book("Title 1", "Author 1", LocalDate.of(1995,12,1));
        booksRented.getBooks().remove(someBook1);

        Book someBook2 = new Book ("Title 11", "Author 11", LocalDate.of(1988,1,1));
        booksAvailable.getBooks().remove(someBook2);

        //Then
        System.out.println(booksRented);
        System.out.println(clonedBooksRented);
        System.out.println(deepClonedBooksRented);
        System.out.println(booksAvailable);
        System.out.println(clonedBooksAvaiable);
        System.out.println(deepClonedBooksAvailable);
        Assert.assertEquals(4, booksRented.getBooks().size());
        Assert.assertEquals(4, clonedBooksRented.getBooks().size());
        Assert.assertEquals(5, deepClonedBooksRented.getBooks().size());
        Assert.assertEquals(9, booksAvailable.getBooks().size());
        Assert.assertEquals(9, clonedBooksAvaiable.getBooks().size());
        Assert.assertEquals(10,deepClonedBooksAvailable.getBooks().size());

    }
}
