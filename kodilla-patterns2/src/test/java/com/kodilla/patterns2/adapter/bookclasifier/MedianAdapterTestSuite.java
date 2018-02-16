package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Brian", "Stars", 2000, "AAA");
        Book book2 = new Book("Eno", "End", 1980, "AAB");
        Book book3 = new Book("Robert", "Sommium", 1970, "AAC");
        Book book4 = new Book("Rich", "Afterlife", 2010, "AAD");

        Set<Book> bookSetToTest = new HashSet<>();
        bookSetToTest.add(book1);
        bookSetToTest.add(book2);
        bookSetToTest.add(book3);
        bookSetToTest.add(book4);

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int calculatedMediana = medianAdapter.publicationYearMedian(bookSetToTest);
        //Then
        Assert.assertEquals(2000, calculatedMediana);
    }
}