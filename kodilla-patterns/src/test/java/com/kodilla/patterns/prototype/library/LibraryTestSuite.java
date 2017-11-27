package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.time.Month;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    Library library;

    @Before
    public void before() {
        library = new Library("no.1");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Book" + n, "Author", LocalDate.of(1990, Month.NOVEMBER, 5))));
    }

    @Test
    public void testGetBookShallowCopy() {
        System.out.println("Test Swallow Copy :");
        //Given
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("no.2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println("Origin library size " + library.getBooks().size());
        //When
        clonedLibrary.getBooks().remove(new Book("Book2", "Author", LocalDate.of(1990, Month.NOVEMBER, 5)));
        //Then
        System.out.println("Origin library size , after removed book from copied library : " + library.getBooks().size());
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
    }

    @Test
    public void testGetBookDeepCopy() {
        System.out.println("Test Deep Copy:");
        //Given
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.deepCopy();
            clonedLibrary.setName("no.2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println("Origin library size " + library.getBooks().size());
        //When
        clonedLibrary.getBooks().remove(new Book("Book2", "Author", LocalDate.of(1990, Month.NOVEMBER, 5)));
        //Then
        System.out.println("Origin library size , after removed book from copied library : " + library.getBooks().size());
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
    }

}
