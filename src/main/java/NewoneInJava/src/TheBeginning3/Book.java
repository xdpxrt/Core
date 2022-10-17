package NewoneInJava.src.TheBeginning3;

class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private int numberOfPages;

    public Book() {
    }

    public Book(String title, String author, int yearOfPublication, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

}