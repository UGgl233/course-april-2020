package com.corejava.staticTopic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 */
public class BookSeller {

    static class Book {
        String id;
        String isbn;
        String name;
        String author;
        DateFormat publishDate;

        public Book(String id, String isbn, String name,
                    String author, DateFormat publishDate) {
            this.id = id;
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.publishDate = publishDate;
        }

        @Override
        public String toString() {
            return String.join(" ", id, isbn, name,
                    author, publishDate.format(new Date()));
        }
    }

    public BookSeller() {}
    private static void sellBooks() {
        List<Book> bookList = new LinkedList<>();
        bookList.add(new Book("11", "588979176",
                "人间失格", "太宰治",
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")));

        bookList.add(new Book("21", "1278901176",
                "百年孤独", "马尔克斯",
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")));

        for (Book b : bookList) System.out.println(b.toString());
    }

    public static void main(String[] args) {
        BookSeller.sellBooks();
    }
}
