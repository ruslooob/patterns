package com.ruslooob.creational.builder;

import java.time.LocalDate;

public final class UserBuilder {

    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthDate;
    private String email;
    private String phone;

    private UserBuilder() {}

    public static UserBuilder newBuilder() {return new UserBuilder();}

    public UserBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public UserBuilder birthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public User build() {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setMiddleName(middleName);
        user.setBirthDate(birthDate);
        user.setEmail(email);
        user.setPhone(phone);
        return user;
    }

}
