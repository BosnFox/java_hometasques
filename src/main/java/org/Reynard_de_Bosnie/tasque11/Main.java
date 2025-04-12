package org.Reynard_de_Bosnie.tasque11;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    private static Set<String> students = new TreeSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("Running options:" +
                "\n1. Add a student" +
                "\n2. Remove a student" +
                "\n3. Show all students" +
                "\n4. Search a student by name" +
                "\n5. Exit" +
                "\n6. Range listing students");
        while (running) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            while (choice < 1 || choice > 6) {
                System.out.println("Between 1 and 6, s'il te plait");
                choice = scanner.nextInt();
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter student's name: ");
                    String nyja = scanner.next();
                    if (students.contains(nyja)) {
                        System.out.println(nyja + " already exists!");
                    } else {
                        students.add(nyja);
                        System.out.println("Student added!");
                    }
                    break;
                case 2:
                    System.out.print("Enter student's name: ");
                    String extert = scanner.next();
                    if (students.remove(extert)) {
                        System.out.println("Student removed!");
                    } else {
                        System.out.println(extert + " not found!");
                    }
                    break;
                case 3:
                    System.out.println("Current students:");
                    for (String student : students) {
                        System.out.println(student);
                    }
                    break;
                case 4:
                    System.out.print("Enter student's name to search: ");
                    String searching = scanner.next();
                    System.out.println(searching + " exists" + (students.contains(searching) ? "!" : " not!"));
                    break;
                case 5:
                    running = false;
                    System.out.println("Execution held...");
                    break;
                case 6:
                    System.out.println("First name:");
                    String firstName = scanner.next();
                    System.out.println("Second name:");
                    String lastName = scanner.next();
                    if (firstName.equals(lastName)){
                        System.out.println("Same name, re-execute!");
                        break;
                    }
                    System.out.println("Are you certain that " + firstName + " comes strictly before" + lastName + "? (y/n)");
                    String answer = scanner.next();
                    if (!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n"))) {
                        System.out.println("y/n");
                        answer = scanner.next();
                    }
                    if (answer.equalsIgnoreCase("n")) {
                        System.out.println("Then start from scratch");
                        break;
                    }
                    System.out.println("Searching...");
                    boolean toPlay = false;
                    for (String student : students) {
                        if (student.equals(firstName)) {
                            toPlay = true;
                        }
                        if (toPlay == true) {
                            System.out.println(student);
                        }
                        if (student.equals(lastName)) {
                            break;
                        }
                    }
                    System.out.println("Search completed!");
                    break;
            }
        }

        scanner.close();
    }
}
