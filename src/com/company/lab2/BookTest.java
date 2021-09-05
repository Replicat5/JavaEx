package com.company.lab2;

public class BookTest {
    public static void main(String[] args) {
        Book goldenFish = new Book("А.C.Пушкин", "Золотая рыбка", 1920);
        Book fairyTail = new Book("Л.Н.Толстой", "Сказка", 1905);
        System.out.println(goldenFish);
        System.out.println("\n");
        System.out.println(fairyTail);
        fairyTail.setNameOfBook("Душа");
        fairyTail.setReleaseDate(1920);
        System.out.println("\n");
        System.out.println(fairyTail);
    }
}
