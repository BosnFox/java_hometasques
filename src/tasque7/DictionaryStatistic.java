package tasque7;

import java.util.*;

public class DictionaryStatistic {
    private List<String> words;
    private int dictionarySize;
    private int polindrom;
    private int maxWordLength;
    private int minWordLength;
    private Set<Character> alphabet;
    private Map<Character, Integer> frequency = new HashMap<>();

    //абвгдежзийклмнопрстуфхцчшщъыьэюя

    public DictionaryStatistic(List<String> words, Set<Character> alphabet) {
        this.words = words;
        this.alphabet = alphabet;
        this.dictionarySize = words.size();
        this.maxWordLength = words.get(0).length();
        this.minWordLength = maxWordLength;
        this.polindrom = 0;
        for (char i : "абвгдежзийклмнопрстуфхцчшщъыьэюя".toCharArray()) {
            // System.out.println(i);
            this.frequency.put(i, 0);
        }
        for (String word : words) {
            LetterCount(word);
            this.maxWordLength = Math.max(word.length(), this.maxWordLength);
            this.minWordLength = Math.min(word.length(), this.minWordLength);
            boolean curr = true;
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    curr = false;
                    break;
                }
            }
            this.polindrom += curr ? 1 : 0;
        }
    }

    private void LetterCount(String word) {
        for (char i : word.toCharArray()) {
            if (frequency.containsKey(i)) {
                this.frequency.put(i, this.frequency.get(i) + 1);
            }
        }
    }

    public String getRandomWord() {
        return words.get((int) (Math.random() * words.size()));
    }

    public void printSymbolsStat() {
        for (char i : this.frequency.keySet()) {
            System.out.println(i + " - " + this.frequency.get(i));
        }
    }


    public void WordsGaming(String word) {
        Map<Character, Integer> curr = new HashMap<>();
        for (char ch : word.toCharArray()) {
            curr.put(ch, curr.getOrDefault(ch, 0) + 1);
        }
        Map<Character, Integer> temp = new HashMap<>();
        System.out.println("Words Gaming For " + word);
        for (String i : this.words) {
            temp.clear();
            for (char ch : i.toCharArray()) {
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
            }
            boolean isSuitable = true;
            for (char ch : temp.keySet()) {
                if (!(temp.getOrDefault(ch, 0) <= curr.getOrDefault(ch, 0))) {
                    isSuitable = false;
                    break;
                }
            }
            if (isSuitable) {
                System.out.println(i);
            }
        }
    }
}
