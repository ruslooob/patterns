package com.ruslooob.structural.adapter;

public class UserB {

    private String id;
    private int age;
    private boolean sex;
    private String firstName;
    private String lastName;
    private String middleName;

    public UserB() {
    }

    public UserB(String firstName, String lastName, String middleName, boolean sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "UserB{" + "id='" + id + '\'' + ", age=" + age + ", sex=" + sex + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", middleName='" + middleName + '\'' + '}';
    }

}
