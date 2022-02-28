package com.ruslooob.creational.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        var user = new User("Ivanov Ivan Ivanovich", "ivan@gmail.com", 20);
        var clonedUser = user.clone();
        //false
        System.out.println(user == clonedUser);
        //true
        System.out.println(user.equals(clonedUser));
    }
}
