package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String s = "Library name:" + name +
                "\n        books:\n";
                for(Book book : books){
            s = s + book.toString() + "\n";
                }
                return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library cloneLibrary = (Library)super.clone();
        cloneLibrary.books = new HashSet<>();
        for(Book book : books){
            cloneLibrary.books.add(book);
        }
        return cloneLibrary;
    }
}
