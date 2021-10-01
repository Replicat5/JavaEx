package com.company.lab3;

public class FurnitureShopTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(5);

        shop.add(new Bed("Стандартная модель", 0.8, 2, 3, 7400, 2,
                230, "Дерево", "Овечья шерсть"));
        System.out.println(shop.getPrices());
        System.out.println("Куплено: "+ shop.buy(3));
        System.out.println(shop.getPrices());
    }
}