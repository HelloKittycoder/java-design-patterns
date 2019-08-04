package com.iluwatar.stockexchange;

/**
 * Created by shucheng on 2019-8-4 下午 16:52
 * 请求类
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name +
                ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name +
                ", Quantity:" + quantity + "] sold");
    }
}
