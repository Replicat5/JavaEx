package com.company.lab2;

public class Book {
    private String author;
    private String nameOfBook;
    private int releaseDate;

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }
    public String getNameOfBook(){
        return author;
    }
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
    public int getReleaseDate(){
        return releaseDate;
    }
    public Book (String author, String name, int year){
        this.author = author;
        nameOfBook = name;
        releaseDate = year;
    }

    @Override
    public String toString() {

        String data = Integer.toString(releaseDate);
        return "Author : " + author + "\nName of Book : " + nameOfBook + "\nRelease date of book : " + data;
    }
}