package com.iluwatar.stockexchange;

/**
 * Created by shucheng on 2019-8-4 下午 16:56
 * 实现了Order接口的实体类
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
