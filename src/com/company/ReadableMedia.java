package com.company;

/**
 * Created by joe.chandler on 12/4/13.
 */
public interface ReadableMedia {
    String turnToNextPage();
    String turnToPreviousPage();
    String turnToPage(int pageNumber);
    String getCurrentPage();
}
