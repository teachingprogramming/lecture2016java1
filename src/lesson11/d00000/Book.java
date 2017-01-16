package lesson11.d00000;

public class Book {
    public String title;
    public String author;
    public int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getInfo() {
        String info = title + ", " + author +", " + price + "円";
        return info;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}