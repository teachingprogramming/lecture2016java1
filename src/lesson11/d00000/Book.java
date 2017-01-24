package lesson11.d00000;

import lesson12.d00000.Product;

public class Book implements Product{
    public String title;
    public String author;
    private int price;

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

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return title + "（" + author + "）";
    }

}