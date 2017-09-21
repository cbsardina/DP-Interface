package com.sardina;

public class Navy extends Soldier implements SpecialForcesFighting {

//constructor
    public Navy(String name, String rank, String branch, long serialNumber) {
        super(name, rank, branch, serialNumber);
    }
//abstract from Soldier
    public String speak () {
        return "Hooyah...Navy......!!";
    }

//SpecialForcesFighting interface
    public String vNeckChop() {
        return "Crushing blow to the windpipe!";
    }
    public String armToNeckChop() {
        return "Attack to the arm then the jugular..";
    }
    public String frontTakeDown() {
        return "Whoop, now you're on your back!";
    }

}
