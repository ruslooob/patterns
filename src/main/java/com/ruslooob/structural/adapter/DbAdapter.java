package com.ruslooob.structural.adapter;

import java.time.LocalDate;
import java.time.Year;

public class DbAdapter {
    private final CrudDatabase<UserA, Long> db = new DB();

    public UserA getById(Long id) {
        return db.getById(id);
    }

    public UserB getById(String id) {
        return convert(db.getById(Long.parseLong(id)));
    }

    public UserA save(UserA userA) {
        return db.save(userA);
    }

    public UserB save(UserB userB) {
        return convert(db.save(convert(userB)));
    }

    public boolean update(UserA userA) {
        return db.update(userA);
    }

    public boolean update(UserB userB) {
        return db.update(convert(userB));
    }

    public boolean delete(UserA userA) {
        return db.update(userA);
    }

    public boolean delete(UserB userB) {
        return db.update(convert(userB));
    }

    public UserA convert(UserB userB) {
        UserA userA = new UserA();
        userA.setId(userB.getId() != null ? Long.parseLong(userB.getId()) : null);
        userA.setSex(userB.isSex() ? Sex.MALE : Sex.FEMALE);
        userA.setYearBirth(Year.of(LocalDate.now().getYear() - userB.getAge()));
        userA.setFullName(String.format("%s %s %s", userB.getFirstName(),
                userB.getLastName(),
                userB.getMiddleName()));

        return userA;
    }

    private UserB convert(UserA userA) {
        UserB userB = new UserB();
        userB.setId(userA.getId() != null ? userA.getId().toString() : null);
        userB.setSex(userA.getSex() == Sex.MALE);
        userB.setAge(LocalDate.now().getYear() - userA.getYearBirth().getValue());

        String[] names = userA.getFullName().split(" ");
        userB.setFirstName(names[0]);
        userB.setLastName(names[1]);
        userB.setMiddleName(names[2]);

        return userB;
    }
}
