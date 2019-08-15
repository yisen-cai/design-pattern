package com.example.adapter.delegate;

import com.example.adapter.Banner;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    public void printWeak() {
        banner.showWithAster();
    }

    public void printStrong() {
        banner.showWithParen();
    }
}
