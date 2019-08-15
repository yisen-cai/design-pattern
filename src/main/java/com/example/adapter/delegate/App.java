package com.example.adapter.delegate;

import com.example.adapter.Banner;


/**
 * 通过委托(Delegate)方式实现适配器模式,
 * 即将需要使用的方法进行接口API封装一层, 降低类之间的耦合性
 * created by 16539
 * 2019/8/15
 */
public class App {
    public static void main(String[] args) {
        Print print = new PrintBanner(new Banner("banner"));
        print.printStrong();
        print.printWeak();
    }
}
