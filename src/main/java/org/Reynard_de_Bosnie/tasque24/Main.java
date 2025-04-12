package org.Reynard_de_Bosnie.tasque24;

import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, NamingException {
        System.out.println("Working with database! You can:\n" +
                "1. Register a User;\n" +
                "2. List all Users;\n" +
                "3. Delete a User;\n" +
                "4. Update User's information;\n" +
                "5. Quit");
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        String option;
        UserService servaque = new UserService(new UserDAOImpl());
        while (running) {
            System.out.println("You amy now select an option: ");
            option = sc.nextLine();
            while (!(option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4") || option.equals("5"))) {
                System.out.println("Invalid option. Git gud.");
                option = sc.nextLine();
            }
            switch (option) {
                case "2":
                    servaque.listAllUsers();
                    break;
                case "3":
                    int removableIndex;
                    System.out.println("Enter User's index");
                    removableIndex = sc.nextInt();
                    servaque.deleteUser(removableIndex);
                    break;
                case "4":
                    String id;
                    System.out.println("Enter User's id");
                    id = sc.nextLine();
                    System.out.println("Enter new User's name");
                    String newName = sc.nextLine();
                    System.out.println("Enter new User's email");
                    String newEmail = sc.nextLine();
                    System.out.println("Changing information...");
                    servaque.updateUser(id, newName, newEmail);
                    break;
                case "5":
                    running = false;
                    System.out.println("Execution held...");
                    break;
                case "1":
                    String name;
                    String email;
                    System.out.println("Enter User's name: ");
                    name = sc.nextLine();
                    System.out.println("Enter User's email: ");
                    email = sc.nextLine();
                    System.out.println("Creating new User...");
                    servaque.registerUser(name, email);
                    break;
            }
        }
    }
}
