package com.kodilla.testing.library;

import java.util.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.isA;

import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {
    LibraryDatabase libraryDatabaseMock;
    BookLibrary bookLibrary;

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        Assert.assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Ignore

    @Test
    public void testListBooksWithConditionMoreThan20() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        Assert.assertEquals(0, theListOfBooks0.size());
        Assert.assertEquals(15, theListOfBooks15.size());
        Assert.assertEquals(0, theListOfBooks40.size());
    }

    @Ignore
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        Assert.assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Before
    public void before() {
        libraryDatabaseMock = mock(LibraryDatabase.class);
        bookLibrary = new BookLibrary(libraryDatabaseMock);

    }


    @Test
    public void testListBooksInHandsOf0() {
        // Given
        List<Book> resultListOfBooks = generateListOfNBooks(0);
        when(libraryDatabaseMock.listBooksInHandsOf(isA(LibraryUser.class))).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBorrowedBooks = bookLibrary.listBooksInHandsOf(new LibraryUser("jan", "Nowak", "1234"));

        //Then
        Assert.assertEquals(0, theListOfBorrowedBooks.size());
        verify(libraryDatabaseMock, atLeastOnce()).listBooksInHandsOf(any());
    }

    @Test
    public void testListBooksInHandsOf1() {
        // Given
        List<Book> resultListOfBooks = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(isA(LibraryUser.class))).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBorrowedBooksByUserWhoHave1Books = bookLibrary.listBooksInHandsOf(new LibraryUser("jan", "Nowak", "1234"));

        //Then
        Assert.assertEquals(1, theListOfBorrowedBooksByUserWhoHave1Books.size());


    }

    @Test
    public void testListBooksInHandsOf5() {
        // Given
        List<Book> resultListOfBooks = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(isA(LibraryUser.class))).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBorrowedBooksByUserWhoHave5Books = bookLibrary.listBooksInHandsOf(new LibraryUser("jan", "Nowak", "1234"));

        //Then
        Assert.assertEquals(5, theListOfBorrowedBooksByUserWhoHave5Books.size());

    }

}