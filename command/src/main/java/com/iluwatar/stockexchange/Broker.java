package com.iluwatar.stockexchange;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shucheng on 2019-8-4 下午 16:57
 * 命令调用类
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    // 添加指令
    public void takeOrder(Order order) {
        orderList.add(order);
    }

    // 处理指令
    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
