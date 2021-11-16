package com.company;

public class Order {
    String[] items;
    int orderNo;
    double price=0.0;

    public void calculatePrice(Menu menu) {
        price=0.0;
        for(String item:items) {
            price+=menu.itemPriceList.get(item);
        }
    }
}
