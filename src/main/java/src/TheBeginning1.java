package src;

import java.util.Scanner;

public class TheBeginning1 {
    public static void main(String[] args) {
        boolean happy = true;
        while (happy) {
            System.out.print("Input numbers:");
            Scanner scanNum = new Scanner(System.in);
            String input = scanNum.nextLine();
            String[] scanArray = input.split(" ");
            double[] doubleArray = new double[scanArray.length];
            for (int i = 0; i < doubleArray.length; i++) {
                doubleArray[i] = Double.parseDouble(scanArray[i]);
            }
            if (doubleArray.length < 5) {
                System.out.println("I need more numbers! Give me at least five");
            } else {
                arrayLength(doubleArray);
                thirdNfivePosistion(doubleArray);
                first4numbers(doubleArray);
                last4numbers(doubleArray);
                each3fromEnd(doubleArray);
                reversePositive(doubleArray);
                indexOfNull(doubleArray);
                multiplication(doubleArray);
                average(doubleArray);
                twoMaximums(doubleArray);
                happy = false;
            }
        }
    }

    public static void arrayLength(double[] doubleArray) {
        System.out.println("Length of Array: " + doubleArray.length);
    }

    public static void thirdNfivePosistion(double[] doubleArray) {
        System.out.println("Third number: " + doubleArray[2]);
        System.out.println("Fifth number: " + doubleArray[4]);
    }

    public static void first4numbers(double[] doubleArray) {
        System.out.print("First numbers: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println(" ");
    }

    public static void last4numbers(double[] doubleArray) {
        System.out.println("Last numbers: ");
        for (int i = doubleArray.length - 4; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println(" ");
    }

    public static void each3fromEnd(double[] doubleArray) {
        System.out.print("Every third from the end: ");
        for (int i = doubleArray.length - 3; i >= 0; i = i - 3) {
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println(" ");
    }

    public static void reversePositive(double[] doubleArray) {
        System.out.print("Backwards positive: ");
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            if (doubleArray[i] > 0) {
                System.out.print(doubleArray[i] + " ");
            }
        }
        System.out.println(" ");
    }

    public static void indexOfNull(double[] doubleArray) {
        System.out.print("Index of null: ");
        int count = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] == 0) {
                count = count + 1;
                System.out.print(i + " ");
            }
        }
        if (count == 0) {
            System.out.print("There's no Null");
        }
        System.out.println(" ");
    }

    public static void multiplication(double[] doubleArray) {
        double multipl = 1;
        for (double v : doubleArray){
            multipl = multipl * v;
        }
        System.out.println("Multiplication of numbers: " + multipl);
    }

    public static void average(double[] doubleArray) {
        double average = 0;
        for (double v : doubleArray) {
            average = average + v;
        }
        System.out.println("Average: " + average / doubleArray.length);
    }

    public static void twoMaximums(double[] doubleArray) {
        double max1 = doubleArray[0];
        double max2 = doubleArray[0];
        for (double v : doubleArray) {
            if (v > max1) {
                max2 = max1;
                max1 = v;
            }
        }
        System.out.println("Maximum 1: " + max1 + " " + "Maximum 2: " + max2);
    }
}