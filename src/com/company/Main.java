package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        //var shirt = new ClothingItem(ClothingItem.PANTS, ClothingSize.L, 99.99, 4);
        var shirt = new Shirt(ClothingSize.L, 99.99, 4);
//        shirt.setType("Shirt");
//        shirt.setSize("M");
//        shirt.setPrice(34.99);
//        shirt.setQuantity(10);

        DisplayItemDetails(shirt);

        var hat = new Hat(ClothingSize.M, 49.99, 1);
        DisplayItemDetails(hat);

         */

        //Store values in simple array. This is used when we know the size of the array already.

        ClothingItem[] items = new ClothingItem[2];
        items[0] = new Shirt(ClothingSize.L, 99.99, 4);
        items[1] = new Hat(ClothingSize.M, 49.99, 1);
        System.out.println("Printing from Array...");
        for (ClothingItem item : items) {
            DisplayItemDetails(item);
        }

        //Above lines 31-33 can be written also as-
        ClothingItem[] item = { new Shirt(ClothingSize.L, 99.99, 4),
                                new Hat(ClothingSize.M, 49.99, 1)
                                };
        for (ClothingItem it : items) {
            DisplayItemDetails(it);
        }

        // If we don't know the numbers of items then Array can't be used. In that case we can use List.

        List<ClothingItem> itemList = new ArrayList<>();
        itemList.add(new Shirt(ClothingSize.L, 99.99, 4));
        itemList.add(new Hat(ClothingSize.M, 49.99, 1));
        System.out.println("Printing from Lists...");
        for (int i = 0; i < itemList.size(); i++) {
            DisplayItemDetails(itemList.get(i));
        }

        //We can manage key-value pair using map defined in HashMap class

        Map<String, ClothingItem> mapItem = new HashMap<>();
        mapItem.put("shirt", new Shirt(ClothingSize.L, 99.99, 4));
        mapItem.put("hat", new Hat(ClothingSize.M, 49.99, 1));
        var anItem = mapItem.get("hat");
        System.out.println("Printing from Map...");
        DisplayItemDetails(anItem);

        //If you want to loop through map. First get the collection of key values.
        var keys = mapItem.keySet();
        System.out.println("Printing from Map loop...");
        for (String key : keys) {
            var itemMap = mapItem.get(key);
            DisplayItemDetails(itemMap);
        }
    }

    private static void DisplayItemDetails(com.company.model.ClothingItem item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Yours %s size %s order will cost %s", item.getSize(), item.getType(), formatter.format(totalPrice));
        System.out.println(output);
    }
}
