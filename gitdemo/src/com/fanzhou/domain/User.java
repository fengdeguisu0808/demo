package com.fanzhou.domain;

public class User {
    private String name;
    private int age;
    private String address;
    private String telephoneNum;

    public User() {
    }

    public User(String name, int age, String address, String telephoneNum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.telephoneNum = telephoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", telephoneNum='" + telephoneNum + '\'' +
                '}';
    }
}
