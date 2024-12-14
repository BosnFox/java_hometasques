package org.src.tasque13;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserCollection // implements java.io.Serializable
{
    private String fileName;
    private ArrayList<User> users;
    public UserCollection(ArrayList<User> users, String fileName) {
        this.users = users;
        this.fileName = fileName;
    }
    public UserCollection(UserCollection nyja) {
        this.users = new ArrayList<>();
        this.users.addAll(nyja.users);
    }
    public void addUser(Scanner sc) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        while (age <= 0 || age > 100) {
            System.out.println("Enter a valid password");
            age = sc.nextInt();
        }
        System.out.println("Enter email:");
        String email = sc.next();
        while (!(email.contains("@") && (email.endsWith("gmail.com") || email.endsWith("mail.com")))) {
            System.out.println("Enter a valid email:");
            email = sc.next();
        }
        users.add(new User(name, age, email));
        // sc.close();
    }
    public void displayUsers() {
        System.out.println("Current users:");
        for (User user : this.getUsers()) {
            System.out.println(user);
        }
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }

    public void saveUsers(ArrayList<User> users) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.fileName + ".ser"))) {
            oos.writeObject(users);
        }
    }

    public ArrayList<User> loadUsers() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.fileName + ".ser"))) {
            return (ArrayList<User>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
