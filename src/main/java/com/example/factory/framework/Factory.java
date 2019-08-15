package com.example.factory.framework;

/**
 * created by 16539
 * 2019/8/15
 */
public abstract class Factory {

    /**
     * 生产产品方法, 先通过createProduct生成实例, 再注册实例
     * 完成生产流程的控制
     *
     * @param owner 参数
     * @return 成品
     */
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
