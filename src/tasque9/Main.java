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
            System.out.println(TotalAttempts == 0 ? "Write that: " + curr + "!" : "And that: " + curr + "!");
            String attempt = scanner1.nextLine();
            if (System.currentTimeMillis() < startTime + secs * 1000) {
                    if (attempt.equals(curr)) {
                        Guesses++;
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Not really...");
                    }
                    TotalAttempts++;
                    symbols += attempt.length();
            }
            else {
                System.out.println("Sorry m8");
            }
        }
        System.out.println("Time's up\nTotal words: " + TotalAttempts +
                "\nTyped correct: " + Guesses + "\nAccuracy: " + (Guesses * 100 / (TotalAttempts)) + "%" + "\nAverage Speed: circa "
                + (float)(symbols / secs) + " per second");
        scanner1.close();
    }
}
