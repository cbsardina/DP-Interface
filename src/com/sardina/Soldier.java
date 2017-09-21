package com.sardina;

public abstract class Soldier {

    String name;
    String rank;
    int serialNumber;

    public String sleep() {
        return "Snore.........";
    }

    public String eat() {
        return "Chomp, chomp, chomp......";
    }

    public String walk () {
        return "Trudge...Clomp....Trudge....Clomp...";
    }

    public abstract String speak();
}
