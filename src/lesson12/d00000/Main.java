package lesson12.d00000;

import lesson11.d00000.Book;
import lesson11.d00000.Comic;

public class Main {
    public static void main(String[] args) {
        // getterの例
        Book book1 = new Book("タイトル1", "著者1", 500);
        // book1.price = 5000; // ← セットできない
        int p = book1.getPrice(); // 取得はgetterを使う

        // キャッシュレジスター
        CashRegister cashRegister = new CashRegister();
        cashRegister.addProduct(new Book("Java逆引きレシピ", "竹添他", 2800));
        cashRegister.addProduct(new Comic("ドラゴンボール", "鳥山", 500, 1));
        cashRegister.addProduct(new BoxedLunch("鶏肉と里芋の煮物", 178, 200));
        cashRegister.printReceipt();
        cashRegister.clear();
    }
}
