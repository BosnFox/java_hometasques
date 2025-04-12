package org.Reynard_de_Bosnie.tasque10;

import org.Reynard_de_Bosnie.tasque7.DictionaryStatistic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\Platon\\Downloads\\knit241_template-master" +
                "\\SecondTasque\\src\\tasque7\\dictionary.txt"));

        List<String> words = new ArrayList<>();
        Set<Character> alefbet = new HashSet<Character>();

        while (scanner.hasNext()) {
            String word = scanner.nextLine();
            words.add(word);
            for (char ch : word.toCharArray()) {
                alefbet.add(ch);
            }
        }
        scanner.close();
        scanner = null;

        int Attempts = 7;
        DictionaryStatistic skanna = new DictionaryStatistic(words, alefbet);
        String guess = skanna.getRandomWord();
        while (guess.length() > 3) {
            guess = skanna.getRandomWord();
        }
        int length = guess.length();
        Map<Integer, Map<Boolean, String>> guillotine = new HashMap<>();
        for (int i = 0; i < length; i++) {
            guillotine.put(i, new HashMap<>());
            guillotine.get(i).put(false, guess.substring(i, i + 1));
        }

        System.out.println(guillotine);
        Scanner scanner1 = new Scanner(System.in);
        while (Attempts > 0) {
            System.out.print("Guess!\n");
            for (int i = 0; i < length; i++) {
                if (guillotine.get(i).keySet().contains(true)) {
                    System.out.print(guillotine.get(i).get(true));
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println("\nThe letter of your choice is:");
            String attempt = scanner1.nextLine();
            while (!(attempt.length() == 1)) {
                System.out.print("A single letter, s'il te plait\n");
                attempt = scanner1.nextLine();
            }

            boolean isPresent = false;
            for (int i = 0; i < length; i++) {
                if (guillotine.get(i).keySet().contains(false)) {
                    if (guillotine.get(i).get(false).equals(attempt)) {
                        isPresent = true;
                        guillotine.get(i).remove(false);
                        guillotine.get(i).put(true, guess.substring(i, i + 1));
                    }
                }
            }
            if (isPresent) {
                System.out.println("Correct! " + attempt + "is in the word");
            }
            else {
                System.out.println("Incorrect! " + attempt + " is in the word");
                Attempts -= 1;
                System.out.println(Attempts + " attempts left");
            }

            boolean isVictorious = true;
            for (int i = 0; i < length; i++) {
                if (guillotine.get(i).keySet().contains(false)) {
                    isVictorious = false;
                    break;
                }
            }
            if (isVictorious) {
                System.out.println("Congrats! You guessed it, " + guess + "is in the word");
                break;
            }
        }
    }
}
