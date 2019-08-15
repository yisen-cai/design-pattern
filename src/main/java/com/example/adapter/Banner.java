package com.example.adapter;

public class Banner {
    private String name;

    public Banner(String name) {
        this.name = name;
    }

    public void showWithParen() {
        System.out.println("(" + this.name + ")");
    }

    public void showWithAster() {
        System.out.println("*" + this.name + "*");
    }
}
