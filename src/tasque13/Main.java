package org.src.tasque13;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        UserCollection main = new UserCollection(new ArrayList<User>(), "main");
        System.out.println("Running options:" +
                "\n1. Add a new user" +
                "\n2. Show all users" +
                "\n3. Serialize users" +
                "\n4. Deserialize users" +
                "\n5. Exit" +
                "\n6. Remove user on name");

        while (running) {
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            while (choice < 1 || choice > 6) {
                System.out.println("Between 1 and 6, s'il te plait");
                choice = sc.nextInt();
            }
            switch (choice) {
                case 1:
                    main.addUser(sc);
                    System.out.println("New user added");
                    break;
                case 2:
                    main.displayUsers();
                    break;
                case 3:
                    main.saveUsers(main.getUsers());
                    break;
                case 4:
                    main = new UserCollection(main.loadUsers(), "main");
                    System.out.println("User loaded: ");
                    main.displayUsers();
                    break;
                case 5:
                    running = false;
                    System.out.println("Execution held...");
                    main.saveUsers(main.getUsers());
                    System.out.println("Progress saved");
                    break;
                case 6:
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    for (int i = 0; i < main.getUsers().toArray().length; i++) {
                        if (main.getUsers().get(i).getName().equals(name)) {
                            main.getUsers().remove(i);
                            break;
                        }
                    }
                    System.out.println("User removed");
                    break;
            }
        }
    }
}
