package com.sardina;

import java.util.Random;

public class NavySealDiver extends Navy implements Bomb, Sidearms, Rifles {

//constructor
    public NavySealDiver(String name, String rank, String branch, long serialNumber) {
        super(name, rank, branch, serialNumber);
    }

//Bomb interface
    public String useBomb() {
        Random random = new Random();
        Integer damage = random.nextInt(100) * random.nextInt(100);
        return "I'm a demolition's expert. My bomb just caused " + damage + " damage!";
    }

//ShootsGun interface
    public String shootRifle(){ return "Bang bang --> rifle shot.."; }
    public String shootSidearm(){ return "Pew pew --> sidearm shot.."; }
//Rifles and Sidearms interface
    public String mp5() { return "Blllltttttttttt tat tat tat...."; }
    public String desertEagle() { return "Pow pow Pow..!"; }

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
                "When an " + this.getBranch() + " fights, we " + this.vNeckChop() + ",\n" +
                "  and " + this.armToNeckChop() + ", and finish them off with a " + this.frontTakeDown() + ".\n" +
                "\n" +
                this.useBomb() + ".\n" +
                "We also like to shoot " + this.shootSidearm() + " & " + this.shootRifle() + ".\n" +
                "But since we're special forces we also get to shoot mp5's " + this.mp5() + " & \n" +
                "Desert eagles " + this.desertEagle() + ".";
    }

}
