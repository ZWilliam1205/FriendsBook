package com.example.friendsbook;

public class Friends {
    // Fields
    String name;
    private int age;
    private String phone;

    // Class constructor
    public Friends(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // Getters and Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    // ToString method

    @Override
    public String toString() {
        return name;
    }
}
