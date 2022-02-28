package com.ruslooob.creational.prototype;

public class User implements Cloneable {

    private String fullName;
    private String email;
    private int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        super.clone();
        return new User(this.fullName, this.email, this.age);
    }

    public User(String fullName, String email, int age) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (!fullName.equals(user.fullName)) return false;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        int result = fullName.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + age;
        return result;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
