package lesson11.d00000;

public class Comic extends Book {
    public int volume;

    public Comic(String title, String author, int price, int volume) {
        super(title, author, price);
        this.volume = volume;
    }

    @Override
    public String getInfo() {
        String info = super.getInfo() + ", " + volume + "巻";
        return info;
    }
}