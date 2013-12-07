package com.company;

import java.util.List;

/**
 * Created by joe.chandler on 12/3/13.
 */
public class Book implements ReadableMedia {
    private String title;
    private String author;
    private int isbn;
    private int currentPage;
    private List<String> pages;

    @Override
    public String turnToNextPage() {
        return null;
    }

    @Override
    public String turnToPreviousPage() {
        return null;
    }

    @Override
    public String turnToPage(int pageNumber) {
        return null;
    }

    @Override
    public String getCurrentPage() {
        return null;
    }

    public Book(String title, String author, int isbn, List<String> pages) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }

    public int getNumberOfPages() {
        return pages.size();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public List<String> getPages() {
        return pages;
    }

}
