package org.Reynard_de_Bosnie.tasque7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\Platon\\Downloads\\knit241_template-master" +
                "\\SecondTasque\\src\\tasque7\\dictionary.txt"));

        int length = 0;
        List<String> words = new ArrayList<>();
        Set<Character> alefbet = new HashSet<Character>();                                                   ;

        while (scanner.hasNext()) {
            String word = scanner.nextLine();
            words.add(word);
            for (char ch : word.toCharArray()){
                alefbet.add(ch);
            }
        }

        scanner.close();
        DictionaryStatistic skanna = new DictionaryStatistic(words, alefbet);
        System.out.println(skanna.getRandomWord());
        // skanna.WordsGaming("библиотека");
        // skanna.printSymbolsStat();
    }
}
