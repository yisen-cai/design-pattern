package com.example.adapter.impl;


/**
 * 通过接口实现Adapter模式, 实现API之间的兼容
 * created by 16539
 * 2019/8/15
 */
public class App {
    public static void main(String[] args) {
        PrintBanner printBanner = new PrintBanner("banner");
        printBanner.printStrong();
        printBanner.printWeak();
    }
}
