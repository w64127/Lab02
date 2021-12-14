package com.company;

public class Human {
    int age, weight, height;
    String name;
    boolean sex;

    public Human(int age, int weight, int height, String name, boolean sex){
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public boolean isSex() {
        return sex;
    }

    public boolean isMale(){
        if (sex == true)
            return true;
        else
            return false;
    }
}
