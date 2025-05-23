package org.Reynard_de_Bosnie.lab2tasque5.lab2tasque5_3;

import java.util.HashMap;
import java.util.Map;

class CharacterFactory {
    private Map<Character, CharacterFlyweight> characters = new HashMap<>();
    public CharacterFlyweight getCharacter(char characterCode) {
        CharacterFlyweight character = characters.get(characterCode);
        if (character == null) {
            character = new ConcreteCharacter(characterCode);
            characters.put(characterCode, character);
        }
        return character;
    }
    public int getSize() {
        return characters.size();
    }
}