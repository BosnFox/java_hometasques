package lab2tasque1.lab2tasque1_3;

import com.sun.jdi.connect.Transport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What type?");
        String type = sc.nextLine();
        TransportFactory dispenser = new TransportFactory();
        ITransport car = dispenser.createTransport(type);
        System.out.println(car.getDescription());
    }
}
