package com.ruslooob.creational.builder;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        //Compare three solutions to create new User
        // solution 1: via constructor
        User user1 = new User("Ivanov", "Ivan", "Ivanovich",
                LocalDate.of(2000, Month.AUGUST, 12), "ivanov@mail.ru", "88005553535");

        System.out.println(user1);

        // solution 2: via default constructor + setters
        User user2 = new User();
        user2.setFirstName("Ivanov");
        user2.setLastName("Ivan");
        user2.setMiddleName("Ivanovich");
        user2.setBirthDate(LocalDate.of(2000, Month.AUGUST, 12));
        user2.setEmail("ivanov@mail.ru");
        user2.setPhone("88005553535");

        System.out.println(user2);

        // solution 3: via builder
        User user3 = UserBuilder.newBuilder()
                .firstName("Ivanov")
                .lastName("Ivan")
                .middleName("Ivanovich")
                .birthDate(LocalDate.of(2000, Month.AUGUST, 12))
                .email("ivanov@mail.ru")
                .phone("88005553535")
                .build();

        System.out.println(user3);
    }

}
