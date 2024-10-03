package lab3;

public class Main {
    public static void main(String[] args) {
        Heavy warrior = new Heavy("Some Ork");
        Soldier mage = new Soldier("Some Mage");
        Medic priest = new Medic("Some Healer");
        warrior.attack(mage);
        priest.heal(mage);
        System.out.println(mage.toString());;
    }
}
