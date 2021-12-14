package com.company;

public class Okrag {

    double sr_okregu;
    int promien;


    public double getPowierzchnia(){
        return Math.PI * Math.pow(this.promien,2);
    }

    public double getSrednica(){
        return this.promien * 2;
    }

    public int getPromien() {
        return promien;
    }

    public Okrag(){}
}
