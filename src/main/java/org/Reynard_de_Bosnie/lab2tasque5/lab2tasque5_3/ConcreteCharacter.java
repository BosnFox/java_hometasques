package org.Reynard_de_Bosnie.lab2tasque5.lab2tasque5_3;

class ConcreteCharacter implements CharacterFlyweight {
    private final char characterCode;

    public ConcreteCharacter(char characterCode) {
        this.characterCode = characterCode;
        System.out.println("Char created for " + characterCode);
    }

    @Override
    public void render(int x, int y, String style) {
        System.out.println("Character displayed at (" + x + ", " + y + "), " + style + " style");
    }

    public char getCharacterCode() {
        return characterCode;
    }
}