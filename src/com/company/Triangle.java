package com.company;

public class Triangle {
    int a, b;

    public Triangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public int area(){
        return this.a * this.b;
    }

    public int perimeter(){
        return (2*this.a) + (2*this.b);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(this.a,2)+Math.pow(this.b,2));
    }
}
