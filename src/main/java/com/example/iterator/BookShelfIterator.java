package com.example.iterator;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }


    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}
