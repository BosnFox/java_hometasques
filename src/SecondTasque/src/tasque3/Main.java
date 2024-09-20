package tasque3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Input a number: ");
//        int num = in.nextInt();

//        System.out.printf("Your number: %d \n", num);
//        in.close();
        Calculator curr = new Calculator();

        while (true) {
            System.out.print("a(void to exit)=");
            String a = in.next();
            if (a.equals("void")) {
                break;
            }
            System.out.print("b(void to exit)=");
            String b = in.next();
            if (b.equals("void")) {
                break;
            }
            System.out.print("operation(+ - / *)=");
            String operation = in.next();
            while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
                System.out.print("operation(+ - / *)please=");
                operation = in.next();
            }

            if (b.equals("0")) {
                while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*")) {
                    System.out.print("operation(+ - *)can't use it w/ zero=");
                    operation = in.next();
                }
            }

            if (operation.equals("+")) {
                System.out.println(curr.add(Integer.parseInt(a), Integer.parseInt(b)));
            } else if (operation.equals("-")) {
                System.out.println(curr.substract(Integer.parseInt(a), Integer.parseInt(b)));
            } else if (operation.equals("*")) {
                System.out.println(curr.multiply(Integer.parseInt(a), Integer.parseInt(b)));
            } else if (operation.equals("/")) {
                System.out.println(curr.divide(Integer.parseInt(a), Integer.parseInt(b)));
            }
        }
    }
}

