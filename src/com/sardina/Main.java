package com.sardina;

public class Main {

    public static void main(String[] args) {

    Army armySoldier = new Army("GI Joe", "Sergeant", "Army", 339298029);

        System.out.println("----- ARMY SOLDIER -----");
        System.out.println("Name: " + armySoldier.getName());
        System.out.println("Rank: " + armySoldier.getRank());
        System.out.println("Branch: " + armySoldier.getBranch());
        System.out.println("S/N: " + armySoldier.getSerialNumber());
        System.out.println(armySoldier.speak());
        System.out.println(armySoldier.walk());
        System.out.println(armySoldier.eat());
        System.out.println(armySoldier.sleep());
        System.out.println(armySoldier.upperCut());
        System.out.println(armySoldier.jabPunch());
        System.out.println(armySoldier.headButt());
        System.out.println(" ");

    Marines marinesSoldier = new Marines("Mike Marine", "Lieutenant", "Marines", 638291408);

        System.out.println("----- MARINES SOLDIER -----");
        System.out.println("Name: " + marinesSoldier.getName());
        System.out.println("Rank: " + marinesSoldier.getRank());
        System.out.println("Branch: " + marinesSoldier.getBranch());
        System.out.println("S/N: " + marinesSoldier.getSerialNumber());
        System.out.println(marinesSoldier.speak());
        System.out.println(marinesSoldier.walk());
        System.out.println(marinesSoldier.eat());
        System.out.println(marinesSoldier.sleep());
        System.out.println(marinesSoldier.tigerClaw());
        System.out.println(marinesSoldier.dragonClaw());
        System.out.println(marinesSoldier.hook());
        System.out.println(" ");


    Navy navySeaman = new Navy("Sammy Seaman", "Captain", "Navy", 774938130);

        System.out.println("----- NAVY SEAMAN -----");
        System.out.println("Name: " + navySeaman.getName());
        System.out.println("Rank: " + navySeaman.getRank());
        System.out.println("Branch: " + navySeaman.getBranch());
        System.out.println("S/N: " + navySeaman.getSerialNumber());
        System.out.println(navySeaman.speak());
        System.out.println(navySeaman.walk());
        System.out.println(navySeaman.eat());
        System.out.println(navySeaman.sleep());
        System.out.println(navySeaman.vNeckChop());
        System.out.println(navySeaman.frontTakeDown());
        System.out.println(navySeaman.armToNeckChop());
        System.out.println(" ");


    }
}
