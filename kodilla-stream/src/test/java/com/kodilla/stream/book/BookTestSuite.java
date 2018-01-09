package com.kodilla.stream.book;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> books = bookDirectory.getList();
        //Then
        int numberOfBookPublicatedAfter2007 = 0;
        for(Book book : books){
            if(book.getYearOfPublication() > 2007) {
                numberOfBookPublicatedAfter2007++;
            }
        }
        Assert.assertEquals(3, numberOfBookPublicatedAfter2007);
    }
    @Test
    public void testGetListUsingIntStream(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> books = bookDirectory.getList();
        //Then
        int numberOfBooksPiblicatedAfter2007 = IntStream.range(0,books.size())
                .filter((n -> books.get(n).getYearOfPublication()>2007))
                .map(n -> 1)
                .sum();
        Assert.assertEquals(3,numberOfBooksPiblicatedAfter2007);
    }
    @Test
    public void testGetListUsingIntStreamUsingLong(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> books = bookDirectory.getList();
        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0,books.size())
                .filter(n -> books.get(n).getYearOfPublication()>2007)
                .count();
        Assert.assertEquals(3,numberOfBooksPublicatedAfter2007);
    }
}
