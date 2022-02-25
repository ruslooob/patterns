package com.ruslooob.structural.adapter;

import java.time.Year;

public class UserA {
    private Long id;
    private Year yearBirth;
    private String fullName;
    private Sex sex;

    public UserA() {
    }

    public UserA(String fullName, Sex sex, Year yearBirth) {
        this.fullName = fullName;
        this.sex = sex;
        this.yearBirth = yearBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Year getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(Year yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserA{" + "id=" + id + ", yearBirth=" + yearBirth + ", fullName='" + fullName + '\'' + ", sex=" + sex + '}';
    }

}
