package com.java8Features.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSort(){
        List<Book> books = new BookDAO().getBooks();
//        using lambda
//        Collections.sort(books, (b1,b2) -> b1.getName().compareTo(b2.getName()));
//        using Method Reference
        Collections.sort(books, Comparator.comparing(Book::getName));
        return books;
    }

    public static void main(String[] args) {
        BookService book = new BookService();
        System.out.print(book.getBooksInSort());
    }
}
//class MyComparator implements Comparator<Book>{
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
