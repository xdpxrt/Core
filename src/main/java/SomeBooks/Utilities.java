package SomeBooks;

class Utilities {
    public static int daysToRead(int numberOfPages) {
        int averagePagesPerDay = 73;
        return numberOfPages / averagePagesPerDay;
    }

    public static void printInfo(String title, String author, int yearOfPublication, int numberOfPages, int daysToRead) {
        System.out.printf("Beginning3.Book added: %25s | %-15s %5d %5dp.      %d days \n", title, author, yearOfPublication, numberOfPages, daysToRead);
    }
}