package org.Reynard_de_Bosnie.tasque1_or_2;

public class Main {
    public static void main(String[] args) {
        Heavy warrior = new Heavy("pootis");
        Soldier mage = new Soldier("cupcake");
        Medic priest = new Medic("emesis");
        warrior.attack(mage);
        priest.heal(mage);
        System.out.println(mage.toString());
        while (mage.is_dead == false){
            warrior.attack(mage);
        }
        warrior.Taunt();
        priest.Taunt();
        priest.heal(mage);
    }
}
