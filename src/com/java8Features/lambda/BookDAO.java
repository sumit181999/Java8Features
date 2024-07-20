package com.java8Features.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(102,"Spring",500));
        books.add(new Book(103,"Junit",200));
        books.add(new Book(104,"Mockito",240));
        books.add(new Book(105,"Spring",560));
        return books;
    }
}
