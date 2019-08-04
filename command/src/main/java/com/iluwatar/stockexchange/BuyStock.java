package com.iluwatar.stockexchange;

/**
 * Created by shucheng on 2019-8-4 下午 16:55
 * 实现了Order接口的实体类
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
