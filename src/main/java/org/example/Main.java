package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Егор";
        post.surname = "Егоров";
        post.patronymic = "Иванович";
        post.phone = "+7 (000) 000-00-00";
        post.passport = "5555 № 666666";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 5;
        post.birthday.year = 2000;
    }
}