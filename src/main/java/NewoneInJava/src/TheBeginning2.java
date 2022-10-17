package NewoneInJava.src;

import java.util.Scanner;

public class TheBeginning2 {
    public static void main(String[] args) {
        System.out.print("Input Number: ");
        Scanner scanNumber = new Scanner(System.in);
        int number = scanNumber.nextInt();
        factorial(number);
        System.out.print("Array one to...: ");
        printNumber(number);
        System.out.println(" ");
        System.out.println("Fibonacci: " + getFibonacci(number));
    }

    public static void factorial(int number) {
        int i = 1;
        int fact = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial: " + fact);
    }

    public static void printNumber(int num) {
        if (num < 1) {
            return;
        } else {
            printNumber(num - 1);
            System.out.print(num + " ");
        }
    }

    public static int getFibonacci(int position) {
        if (position <= 1) {
            return 1;
        } else if (position == 2) {
            return 1;
        } else {
            return getFibonacci(position - 1) + getFibonacci(position - 2);
        }
    }
}

