package com.example.factory.idcard;

import com.example.factory.framework.Factory;
import com.example.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * 工厂实现类, 实现生产
 * created by 16539
 * 2019/8/16
 */
public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<String>();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
