package com.example.template;

/**
 * template method模式,
 * 抽象父类实现逻辑控制, 子类实现具体方法
 * created by 16539
 * 2019/8/15
 */
public class App {
    public static void main(String[] args) {
        Display display = new Display();
        display.display();
    }
}
