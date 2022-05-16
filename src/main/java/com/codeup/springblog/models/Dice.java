package com.codeup.springblog.models;

public class Dice {

    private double number;

    public Dice(){
    }
    public Dice(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public double setNumber(double number) {
        this.number = number;
        return number;
    }
}
