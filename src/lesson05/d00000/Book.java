package lesson05.d00000;

public class Book {
    String title;
    String author;
    int price;

    /**
     * コンストラクタ
     */
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /**
     * 情報を表示するメソッド
     */
    public void printInfo() {
        System.out.println("タイトル: "+title);
        System.out.println("著者: "+author);
        System.out.println("税抜き価格: "+price);
    }
}
