package com.company;

public class MyNumber {
    int a;

    public MyNumber(int a) {
        this.a = a;
    }

    public boolean MyNumberIsOdd(){
        return ! MyNumberIsEven();
    }

    public boolean MyNumberIsEven(){
        return this.a % 2 == 0;
    }

    public double MyNumberSqrt(){
        return Math.sqrt(this.a);
    }

    public MyNumber pow(MyNumber x){
        return new MyNumber((int)Math.pow(this.a, x.a));
    }

    public MyNumber add(MyNumber x){
        return new MyNumber(this.a + x.a);
    }

    //this a jako pole tej klasy minus x a jako x jako klasa ta druga
    public MyNumber subtract(MyNumber x){
        return new MyNumber(this.a - x.a);
    }
}
