package lesson11.d00000;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // コンストラクタの定義・利用、メソッドのオーバーライド
        Book book1 = new Book("Javaの絵本", "アンク", 1580);
        System.out.println(book1.getInfo());
        Comic comic1 = new Comic("ドラえもん", "藤子不二雄", 500, 1);
        System.out.println(comic1.getInfo());

        // 合計金額を計算(1)
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Java逆引きレシピ", "竹添他", 2800));
        bookList.add(new Book("Kotlinスタートブック", "長澤", 3500));
        ArrayList<Comic> comicList = new ArrayList<Comic>();
        comicList.add(new Comic("ドラゴンボール", "鳥山", 500, 1));
        comicList.add(new Comic("ドラゴンボール", "鳥山", 500, 2));

        int totalPrice1 = 0;
        for (int i=0; i<bookList.size(); i++) {
            Book b = bookList.get(i);
            totalPrice1 += b.price;
        }
        for (Comic c : comicList) { // 拡張for文[教科書P.170]
            totalPrice1 += c.price;
        }
        System.out.println("合計金額は" + totalPrice1 + "円です。");

        // サブクラスのインスタンスをスーパークラスのインスタンスとして扱う
        Comic comic2 = new Comic("ワンピース", "尾田", 500, 1);
        Book book2 = (Book)comic2;
        System.out.println(book2.getInfo());

        // 合計金額を計算する(2)
        ArrayList<Book> bookAndComicList = new ArrayList<>();
        bookAndComicList.add(new Book("Java逆引きレシピ", "竹添他", 2800));
        bookAndComicList.add(new Book("Kotlinスタートブック", "長澤", 3500));
        bookAndComicList.add(new Comic("ドラゴンボール", "鳥山", 500, 1));
        bookAndComicList.add(new Comic("ドラゴンボール", "鳥山", 500, 2));
        int totalPrice2 = 0;
        for (Book b : bookAndComicList) {
            totalPrice2 = b.price;
        }
        System.out.println("合計金額は" + totalPrice2 + "円です。");

        // ObjectクラスのtoStringメソッド
        System.out.println(book2);
    }
}