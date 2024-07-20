package com.java8Features.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSort(){
        List<Book> books = new BookDAO().getBooks();
//        traditional method
//        Collections.sort(books,new MyComparator1());
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
//class MyComparator1 implements Comparator<Book>{
//
//    private final  MyComparator2 myComparator2 = new MyComparator2();
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        if(o1.getName().compareTo(o2.getName())==0){
//            return myComparator2.compare(o1,o2);
//        }else{
//            return o1.getName().compareTo(o2.getName());
//        }
//    }
//}
//class MyComparator2 implements Comparator<Book>{
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o2.getPages()-o1.getPages();
//    }
//}
