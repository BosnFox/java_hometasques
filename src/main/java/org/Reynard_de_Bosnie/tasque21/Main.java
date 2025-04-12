package org.Reynard_de_Bosnie.tasque21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static <T> List<T> filter(List<T> elems, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T elem : elems) {
            if (predicate.test(elem)) {
                filtered.add(elem);
            }
        }
        return filtered;
    }
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> filtered = filter(words, s -> s.startsWith("b"));
        System.out.println(filtered);
    }
}
