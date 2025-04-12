package org.Reynard_de_Bosnie.tasque16;

public class Main {
    public static void main(String[] args) {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                System.out.println("Je " + suit + " " + rank.toString().substring(0, rank.toString().length()-1));
            }
            System.out.println("I ce sut' tilky " + rank);
        }
    }
}
