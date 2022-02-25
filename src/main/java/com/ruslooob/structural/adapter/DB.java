package com.ruslooob.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DB implements CrudDatabase<UserA, Long>{
    private long id = 0;
    List<UserA> users = new ArrayList<>();

    public UserA getById(Long id) {
        return users.stream()
                    .filter(user -> user.getId().equals(id))
                    .findAny()
                    .orElseThrow(() -> new RuntimeException("User now found"));
    }

    public UserA save(UserA user) {
        user.setId(id++);
        user.setId(id);
        users.add(user);
        return user;
    }

    public boolean update(UserA user) {
        UserA userA = users.stream()
                           .filter(dbUser -> dbUser.getId().equals(user.getId()))
                           .findAny()
                           .orElse(null);

        if (userA == null) {
            return false;
        }

        // forbid to update id
//        userA.setId(user.getId());
        user.setYearBirth(user.getYearBirth());
        user.setFullName(user.getFullName());
        user.setSex(user.getSex());
        return true;
    }

    public boolean delete(Long id) {
        return users.removeIf(user -> user.getId().equals(id));
    }
}
