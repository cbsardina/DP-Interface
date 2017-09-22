package com.sardina;

public class Army extends Soldier implements BrawlFighting, ShootsGun {

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

//ShootsGun interface
    public String shootRifle(){ return "Bang bang --> rifle shot.."; }
    public String shootSidearm(){ return "Pew pew --> sidearm shot.."; }

//toString all info
    public String toString() {
        return "Soldier's Name: " + this.getName() + ".\n" +
                "Rank: " + this.getRank() + ".\n" +
                "Branch: " + this.getBranch() + ".\n" +
                "S/N: " + this.getSerialNumber() + ".\n" +
                "In the " + this.getBranch() + " we say " + this.speak() + ".\n" +
                "When we walk we " + this.walk() + ".\n" +
                "On our way from the mess hall to our barracks our feet go " + this.walk() + ".\n" +
                "And when we sleep we " + this.sleep() + ".\n" +
                "When an " + this.getBranch() + " fights, we " + this.upperCut() + ",\n" +
                "  and " + this.jabPunch() + ", and finish them off with a " + this.headButt() + ".\n" +
                "I like to shoot " + this.shootSidearm() + ".";
    }
}