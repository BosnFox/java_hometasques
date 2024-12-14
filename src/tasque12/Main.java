package org.src.tasque12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import tasque12.ProclaimFileVisitor;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the absolute path");
        String path = sc.nextLine();
        // int TotalWords = 0;
        Path listae = Paths.get(path);
        try {
            System.out.println("Now attempting to read the directory...");
            Files.walkFileTree(listae, new ProclaimFileVisitor());
        } catch (IOException var6) {
            IOException e = var6;
            System.out.println("Something went wrong: " + e.getMessage());
        }

    }
}
