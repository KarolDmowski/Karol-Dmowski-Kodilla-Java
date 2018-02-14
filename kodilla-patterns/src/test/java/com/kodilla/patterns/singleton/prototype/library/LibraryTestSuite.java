package com.kodilla.patterns.singleton.prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Original Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Title " + n, "Author" + n, LocalDate.now())));

        Library shallowCloneLibrary = null;
        try{
            shallowCloneLibrary = library.shallowCopy();
            shallowCloneLibrary.setName("Shallow Clone Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try{
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Deep Clone Library");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //When
        System.out.println(library);
        System.out.println(shallowCloneLibrary);
        library.getBooks().add(new Book("New Book", "New Authr", LocalDate.now()));
        //Then
        System.out.println(library);
        System.out.println(shallowCloneLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(6,library.getBooks().size());
        Assert.assertEquals(6,shallowCloneLibrary.getBooks().size());
        Assert.assertEquals(5,deepCloneLibrary.getBooks().size());
    }
}
