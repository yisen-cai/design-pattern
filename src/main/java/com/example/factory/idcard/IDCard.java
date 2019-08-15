package com.example.factory.idcard;

import com.example.factory.framework.Product;

/**
 * 产品类
 * created by 16539
 * 2019/8/15
 */
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println("生产 " + owner + " 的ID卡");
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void use() {
        System.out.println("使用 " + owner + " 的ID卡");
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "owner='" + owner + '\'' +
                '}';
    }
}
