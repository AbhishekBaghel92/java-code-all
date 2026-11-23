class Book {
    String title, author;
    double price;

    Book() { title = "Unknown"; author = "Unknown"; price = 0.0; }
    Book(String title, String author) { this.title = title; this.author = author; }
    Book(String title, String author, double price) {
        this.title = title; this.author = author; this.price = price;
    }
    void show() { System.out.println(title + " | " + author + " | $" + price); }
}

public class Constructors {
    public static void main(String[] args) {
        new Book().show();
        new Book("Java Basics", "James").show();
        new Book("Clean Code", "Robert Martin", 35.5).show();
    }
}
