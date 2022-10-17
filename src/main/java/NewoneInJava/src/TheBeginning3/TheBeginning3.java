package NewoneInJava.src.TheBeginning3;

public class TheBeginning3 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\tTitle | Author\t\t\t Year  Pages  How long ro read?!");
        Book book1 = new Book("Great Mountain", "Scott Wilkins", 1974, 354);
        Book book2 = new Book("Jeffery's Life", "Helen Brooks", 2017, 154);
        Book book3 = new Book();

        book3.setTitle("1917: How They Are Gone");
        book3.setAuthor("Richard Bower");
        book3.setYearOfPublication(1953);
        book3.setNumberOfPages((421));

        Utilities.printInfo(book1.getTitle(), book1.getAuthor(), book1.getYearOfPublication(), book1.getNumberOfPages(), Utilities.daysToRead(book1.getNumberOfPages()));
        Utilities.printInfo(book2.getTitle(), book2.getAuthor(), book2.getYearOfPublication(), book2.getNumberOfPages(), Utilities.daysToRead(book2.getNumberOfPages()));
        Utilities.printInfo(book3.getTitle(), book3.getAuthor(), book3.getYearOfPublication(), book3.getNumberOfPages(), Utilities.daysToRead(book3.getNumberOfPages()));
    }
}





