package com.example.adapter.impl;

import com.example.adapter.Banner;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String name) {
        super(name);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
