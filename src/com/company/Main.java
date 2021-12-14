package com.company;

public class Main {

    public static void main(String[] args) {
        //Exercise 1 - class Human
        Human ob1 = new Human(12,56,143,"Jan",true);
        System.out.println(ob1.getName());
        System.out.println(ob1.getWeight());
        System.out.println(ob1.getAge());
        System.out.println(ob1.isMale());

        //Exercise 2 - class Triangle
        Triangle ob2 = new Triangle(5,6);
        System.out.println(ob2.area());
        System.out.println(ob2.perimeter());
        System.out.println(ob2.diagonal());

        //Exercise3
        MyNumber ob3 = new MyNumber(6);
        MyNumber ob4 = new MyNumber(2);
        System.out.println(ob3.MyNumberIsOdd());
        System.out.println(ob3.MyNumberIsOdd());
        System.out.println(ob3.MyNumberSqrt());
        System.out.println(ob3.pow(ob4));
        System.out.println(ob4.pow(ob3));
        System.out.println(ob3.add(ob4));
        System.out.println(ob3.subtract(ob4));

        //Exercise4

    }
}
