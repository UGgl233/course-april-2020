package com.corejava.staticTopic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 */
public class Book {

    static class BookTable {
        String id;
        String isbn;
        String name;
        String author;
        DateFormat publishDate;

        public BookTable(String id, String isbn, String name,
                         String author, DateFormat publishDate) {
            this.id = id;
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.publishDate = publishDate;
        }
    }

    static {
        BookTable bt = new BookTable("1", "588756789876",
                "S3从删库到跑路", "Jeff Bezos",
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"));
    }
}
