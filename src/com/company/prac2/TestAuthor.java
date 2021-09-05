package com.company.prac2;

public class TestAuthor {
    public static void main(String[] args) {
        Author alex = new Author("Александр", "alex@mail.ru", 'M');
        Author lev = new Author("Лев", 'M');
        lev.setEmail("lev@mail.ru");
        String levEmail = lev.getEmail();
        System.out.println("Почта Лева : "+ levEmail);
        String alexName = alex.getName("Александр");
        System.out.println("Имя Автора : " + alexName);
        System.out.println("\n");
        System.out.println(alex);
        System.out.println("\n");
        System.out.println(lev);

    }
}
