package com.company.model;

public class Shirt extends ClothingItem {      // You will get an error -> There is no default constructor available in 'com.company.model.ClothingItem'
    //To fix the error do (alt + fn + insert) and click constructor, you will get below constructor.

    public Shirt(ClothingSize size, double price, int quantity) {
        super(ClothingItem.SHIRT, size, price, quantity);
    }
}
