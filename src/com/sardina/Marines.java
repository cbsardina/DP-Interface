package com.sardina;

public class Marines extends Soldier implements KungFooFighting {

//constructor
    public Marines(String name, String rank, String branch, long serialNumber) {
        super(name, rank, branch, serialNumber);
    }

//abstract from Soldier
    public String speak () {
        return "Hoorah...Marines....!";
    }

//KungFooFighting interface
    public String dragonClaw() {
        return "Tiger Claw to the neck";
    }
    public String tigerClaw() {
        return "Tiger Claw to the eyes";
    }
    public String hook() {
        return "Hook to the sternum";
    }
}
