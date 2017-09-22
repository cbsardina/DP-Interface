package com.sardina;

public class Marines extends Soldier implements KungFooFighting, ShootsGun {

//constructor
    public Marines(String name, String rank, String branch, long serialNumber) {
        super(name, rank, branch, serialNumber);
    }

//abstract from Soldier
    public String speak () {
        return "Hoorah...Marines....!";
    }

//KungFooFighting interface
    public String dragonClaw() { return "Tiger Claw to the neck"; }
    public String tigerClaw() { return "Tiger Claw to the eyes"; }
    public String hook() { return "Hook to the sternum"; }

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
                "When an " + this.getBranch() + " fights, we " + this.dragonClaw() + ",\n" +
                "  and " + this.tigerClaw() + ", and finish them off with a " + this.hook() + ".\n" +
                "I like to shoot " + this.shootRifle() + ".";
    }

}
