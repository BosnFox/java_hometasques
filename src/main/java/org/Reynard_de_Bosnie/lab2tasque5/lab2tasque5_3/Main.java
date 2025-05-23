package org.Reynard_de_Bosnie.lab2tasque5.lab2tasque5_3;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        int x = 0;
        int y = 0;
        String style = "Обычный";
        for (char c : "ДАЯНОДИОКРЛКВЙАБНА".toCharArray()) {
            CharacterFlyweight character = factory.getCharacter(c);
            character.render(x, y, style);
            x += 10;
            if (x > 50) {
                x = 0;
                y += 20;
                style = (style.equals("Обычный")) ? "Жирный" : "Обычный";
            }
        }
        System.out.println("Unique chars created: " + factory.getSize());
    }
}
