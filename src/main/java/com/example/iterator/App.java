package com.example.iterator;

/**
 * Iterator模式, 实现对集合对象的控制, 减少类之间的依赖
 * created by 16539
 * 2019/8/15
 */
public class App {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        for (int i = 0; i < 4; i++) {
            bookShelf.appendBook(new Book("book " + i));
        }

        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
