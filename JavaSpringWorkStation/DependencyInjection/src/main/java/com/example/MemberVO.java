package com.example;

public class MemberVO {
    private String name;
    private int age;
    public MemberVO() {}
    public MemberVO(String name, int age) {
        this.setName(name);
        this.setAge(age);
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

    public MemberVO name(String name) {
        this.name = name;
        return this;
    }

    public MemberVO age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

}