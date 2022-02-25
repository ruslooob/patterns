package com.ruslooob.structural.adapter;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
        UserA userA = new UserA("Ivanov Ivan Ivanovich1", Sex.MALE, Year.of(2001));

        UserB userB = new UserB("Ivanov", "Ivan", "Ivanovich2", true, 20);

        DbAdapter db = new DbAdapter();

        UserA saveUserA = db.save(userA);
        UserB saveUserB = db.save(userB);

        System.out.println(saveUserA);
        System.out.println(saveUserB);
    }
}
