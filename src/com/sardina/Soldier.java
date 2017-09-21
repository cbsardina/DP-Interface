package com.sardina;

public abstract class Soldier {

    String name;
    String rank;
    String branch;
    long serialNumber;

    public Soldier(String name, String rank, String branch, long serialNumber) {
        this.name = name;
        this.rank = rank;
        this.branch = branch;
        this.serialNumber = serialNumber;
    }

    public abstract String speak();

    public String sleep() {
        return "Snore.........";
    }

    public String eat() {
        return "Chomp, chomp, chomp......";
    }

    public String walk () {
        return "Trudge...Clomp....Trudge....Clomp...";
    }



//getters

    public String getName() { return name; }

    public String getRank() { return rank; }

    public String getBranch() { return branch; }

    public long getSerialNumber() { return serialNumber; }
}
