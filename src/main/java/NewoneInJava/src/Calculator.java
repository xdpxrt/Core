package NewoneInJava.src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello there!");
        boolean happy = false;
        while (!happy) {
            System.out.print("Choose the number: ");
            Scanner scan1 = new Scanner(System.in);
            double num1 = scan1.nextDouble();
            System.out.print("Choose another one: ");
            double num2 = scan1.nextDouble();

            boolean ready = true;
            while (ready) {
                System.out.print("And what now? ");
                String oper = scan1.next();

                switch (oper) {
                    case "addition":
                        System.out.println(num1 + num2);
                        ready = false;
                        break;
                    case "subtraction":
                        System.out.println(num1 - num2);
                        ready = false;
                        break;
                    case "multiplication":
                        System.out.println(num1 * num2);
                        ready = false;
                        break;
                    case "splitting":
                        if (num2 == 0) {
                            System.out.println("really?!");
                        } else {
                            System.out.println(num1 / num2);
                            ready = false;
                        }
                        break;
                }
            }
            System.out.print("Happy now? ");
            String answer = scan1.next();
            if (answer.equals("yes")) {
                happy = true;
            }

        }

        System.out.println("Thanks god!");
    }

}
