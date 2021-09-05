package com.company.prac1;

public class Book {
    private String nameOfBook;
    private int releaseDate;

    public Book (String name, int year){
        nameOfBook = name;
        releaseDate = year;
    }

    @Override
    public String toString() {

        String data = Integer.toString(releaseDate);
        return "Name of Book : " + nameOfBook + "\nRelease date of book : " + data;
    }
}