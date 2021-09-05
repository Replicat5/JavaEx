package com.company.prac2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public Author (String name, char gender){
        this.name = name;
        this.gender = gender;
    }

    public String getName(String name){
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(char gender){
        return gender;
    }

    @Override
    public String toString() {

        String genderS = Character.toString(gender);
        return "Author name : " + name + "\nAuthor email : " + email + "\nAuthor gender : " + genderS;
    }
}
