package com.sardina;

public class Navy extends Soldier implements SpecialForcesFighting, ShootsGun {

//constructor
    public Navy(String name, String rank, String branch, long serialNumber) {
        super(name, rank, branch, serialNumber);
    }
//abstract from Soldier
    public String speak () {
        return "Hooyah...Navy......!!";
    }

//SpecialForcesFighting interface
    public String vNeckChop() { return "Crushing blow to the windpipe!"; }
    public String armToNeckChop() { return "Attack to the arm then the jugular.."; }
    public String frontTakeDown() { return "Whoop, now you're on your back!"; }

//ShootsGun interface
    public String shootRifle(){ return "Bang bang --> rifle shot.."; }
    public String shootSidearm(){ return "Pew pew --> sidearm shot.."; }

    @Override
    public String laserGun() {
        return "The marines thought they got the coolest laser gun but they were wrong. They got our old stuff. We have the new ones that go ZZZZZZZZAAAAAPOWWWW!!!";
    }

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
                "I like to shoot " + this.shootSidearm() + ".";
    }
}
