package com.sardina;

public class Main {

    public static void main(String[] args) {

    Army armySoldier = new Army("GI Joe", "Sergeant", "Army", 339298029);
        System.out.println("----- ARMY SOLDIER -----");
        System.out.println(armySoldier.toString());
        System.out.println(" ");

    Marines marinesSoldier = new Marines("Mike Marine", "Lieutenant", "Marines", 638291408);
        System.out.println("----- MARINES SOLDIER -----");
        System.out.println(marinesSoldier.toString());
        System.out.println(" ");
        System.out.println("The marines just got the new laser gun. It goes " + marinesSoldier.laserGun());
        System.out.println(" ");

    Navy navySeaman = new Navy("Sammy Seaman", "Captain", "Navy", 774938130);
        System.out.println("----- NAVY SEAMAN -----");
        System.out.println(navySeaman.toString());
        System.out.println(" ");

    NavySealDiver navySeal = new NavySealDiver("Charlie Herman", "Petty class first offier", "Navy", 739278404)  ;
        System.out.println("----- NAVY SEAL -----");
        System.out.println(navySeal.toString());
        System.out.println(" ");
        System.out.println(navySeal.laserGun());




    }
}
