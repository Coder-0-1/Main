package com.assignment20201130;

public class Vehicle {
    private String trademark;
    private String color;

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void run() {
    }

    public void showInfo() {
    }
}

class Train extends Vehicle {
    private int carriagesNum;

    public int getCarriagesNum() {
        return carriagesNum;
    }

    public void setCarriagesNum(int carriagesNum) {
        this.carriagesNum = carriagesNum;
    }

    public void showTrain() {
    }
}

class Car extends Vehicle{
    private int seatingNum;

    public int getSeatingNum() {
        return seatingNum;
    }

    public void setSeatingNum(int seatingNum) {
        this.seatingNum = seatingNum;
    }

    public void showCar(){
    }
}

class Truck extends Vehicle{
    private int loadNum;

    public int getLoadNum() {
        return loadNum;
    }

    public void setLoadNum(int loadNum) {
        this.loadNum = loadNum;
    }
    
    public void showTrunk(){
    }
}