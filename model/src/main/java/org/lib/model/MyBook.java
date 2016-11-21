/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lib.model;

import java.io.Serializable;

/**
 *
 * @author danecek
 */
public class MyBook implements Serializable {

    private BookId bookId;
    private String title;
    private String author;

    public MyBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public MyBook(BookId bookId, String title, String author) {
        this(title, author);
        this.bookId = bookId;
    }

    /**
     * @return the bookId
     */
    public BookId getBookId() {
        return bookId;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }
}
