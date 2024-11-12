package tasque9;

import tasque7.DictionaryStatistic;

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

        Scanner scanner1 = new Scanner(System.in);


        DictionaryStatistic skanna = new DictionaryStatistic(words, alefbet);

        // the barbeque begins here
        int TotalAttempts = 0;
        int symbols = 0;
        int Guesses = 0;
        int secs = 10;
        long startTime = System.currentTimeMillis();
        while (startTime + secs * 1000 > System.currentTimeMillis()) {
            String curr = skanna.getRandomWord();
            while (curr.length() >= 9) {
                curr = skanna.getRandomWord();
            }
            System.out.println(TotalAttempts == 0 ? "Guess the word, length: " + curr.length() + "!" : "Guess another word, length: " + curr.length() + "!");
            boolean guessed = false;
            int total = 1;
            System.out.println(curr.substring(0, total) + "[...]");
            boolean lastAttempt = false;
            while (!guessed) {
                String attempt = scanner1.nextLine();
                if (attempt.equals(curr)) {
                    Guesses ++;
                    guessed = true;
                    System.out.println("Correct, it was " + curr);
                } else {
                    if (!(lastAttempt)) {
                        total += 2;
                        System.out.println("Nope, it's " + curr.substring(0, Math.min(curr.length(), total)) + "[...]");
                        if (Math.min(curr.length(), total) == curr.length()) {
                            lastAttempt = true;
                        }
                    }
                    else {
                        System.out.println("Nope");
                        guessed = true;
                    }
                }
                TotalAttempts++;
                symbols += attempt.length();
            }
        }
        System.out.println("Time's up\nTotal attempts: " + TotalAttempts +
                "\nGuessed: " + Guesses + "\nAccuracy: " + (Guesses * 100 / (TotalAttempts)) + "%" + "\nAverage Speed: circa "
        + symbols / secs + " per second");
        scanner1.close();
    }
}
