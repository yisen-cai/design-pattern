package com.example.template;

/**
 * created by 16539
 * 2019/8/15
 */
public abstract class AbstractDisplay {
    abstract void open();

    abstract void print();

    abstract void close();

    /**
     * 在抽象类中可以定义实现方法,
     * 可以实现方法的流程控制
     */
    public void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
