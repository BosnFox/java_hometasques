package lab2tasque1.lab2tasque1_1;

import java.security.KeyStore;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApproverFactory Dispenser = new ApproverFactory();
        Approver junior = Dispenser.getApprover("J");
        Approver senior = Dispenser.getApprover("S");
        Approver director = Dispenser.getApprover("M");

        junior.setNextApprover(senior);
        senior.setNextApprover(director);
        // TODO redo w/ errors & an approver factory

        Scanner console = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.print("Enter your error code (-1 to exit, 0 & 1 minor, 2 medium, 3 complex): ");
            Integer error = console.nextInt();
            if (error.equals(-1)) {done = true;}
            else {junior.processRequest(error);}
        }
    }
}