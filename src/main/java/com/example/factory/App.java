package com.example.factory;

import com.example.factory.framework.Factory;
import com.example.factory.framework.Product;
import com.example.factory.idcard.IDCardFactory;

/**
 * Factory工厂类模式
 * created by 16539
 * 2019/8/15
 */
public class App {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product product1 = factory.create("16539");
        Product product2 = factory.create("139510");
        Product product3 = factory.create("yisen614");
        product1.use();
        product2.use();
        product3.use();
    }
}
