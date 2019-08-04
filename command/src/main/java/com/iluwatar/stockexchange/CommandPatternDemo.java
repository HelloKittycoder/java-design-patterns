package com.iluwatar.stockexchange;

/**
 * Created by shucheng on 2019-8-4 下午 17:00
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        // 使用Broker类来接受并执行命令
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
