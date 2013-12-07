package com.company

/**
 * Created by joe.chandler on 12/6/13.
 */
class BookTest extends GroovyTestCase {
    def pages = ["page1", "page2", "page3"]
    def author = "Angela Watson"
    def title = "Some Book About Things"
    def isbn = 123456789

    void testGetCurrentPage() {
        Book book = new Book(title, author, isbn, pages)

        assertEquals(pages[0], book.getCurrentPage())

    }

    void testTurnToNextPage() {
        Book book = new Book(title, author, isbn, pages)


    }

    void testTurnToPreviousPage() {

    }

    void testTurnToPage() {
        Book book = new Book(title, author, isbn, pages)

        assert book.turnToPage(0) == pages[0]
        assert book.turnToPage(pages.size() - 1) == pages.last()
    }


    void testGetNumberOfPages() {

    }

    void testGetTitle() {

    }

    void testGetAuthor() {

    }

    void testGetIsbn() {

    }

    void testGetPages() {

    }
}
