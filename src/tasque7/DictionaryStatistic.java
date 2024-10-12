package tasque7;

import java.util.*;

public class DictionaryStatistic {
    private List<String> words;
    private int dictionarySize; // Количество слов
    private int polindrom; // Количество слов полиндромов
    private int maxWordLength; // маскимальная длина слова в словаре
    private int minWordLength; // минимальная длина слова в словаре
    private Set<Character> alphabet; // буквы алфавита
    private int[] frequency; //частота букв в словаре (в кадой ячейке хранит частоту букв, а индрес - это позиция буквы в alpabet)

    public DictionaryStatistic(List<String> words, Set<Character> alphabet) {
        this.words = words;
        this.alphabet = alphabet;
        this.dictionarySize = words.size();
        this.maxWordLength = words.get(0).length();
        this.minWordLength = maxWordLength;
        this.polindrom = 0;
        for (String word : words){
            LetterCount();
            this.maxWordLength = Math.max(word.length(), this.maxWordLength);
            this.minWordLength = Math.min(word.length(), this.minWordLength);
            boolean curr = true;
            for (int i = 0; i < word.length() / 2; i++){
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)){
                    curr = false;
                    break;
                }
            }
            this.polindrom += curr ? 1 : 0;
        }
    }

    private void LetterCount(){}

    public String getRandomWord() {
        return words.get((int) (Math.random() * words.size()));
    }

    public void printSymbolsStat() {

        /*
                Выведите количество встречающихся букв:
                Пример
                а - 100
                б - 10
                в - 12
                ...
                я - 1
         */
    }

}
