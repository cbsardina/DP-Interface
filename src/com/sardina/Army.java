package com.sardina;

public class Army extends Soldier implements BrawlFighting {

//constructor
    public Army(String name, String rank, String branch, long serialNumber) {
        super(name, rank, branch, serialNumber);
    }

//abstract from Soldier
    public String speak() {
        return "Hooah..Army....!";
    }

//BrawlFighting interface
    public String upperCut() {
        return "Uppercut to the jaw!";
    }
    public String jabPunch() {
        return "Jab to the eye!";
    }
    public String headButt() {
        return "Ahh, a forehead to the nose..";
    }
}
