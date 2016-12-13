package lesson09.d00000;

import lesson05.d00000.Book;

public class MainArray {

    public static void main(String[] args) {
        // プリミティブ型の配列
        int[] a = new int[5];
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]); // プリミティブ型の要素は初期値が入ってる。
        }

        // lesson05で作ったBookの配列
        Book[] bookArray = new Book[3]; // bookArrayをインスタンス化しただけであって、要素はインスタンス化されてない！

        for (int i=0; i<bookArray.length; i++) {
            bookArray[i].printInfo(); // Null Pointer Exception
        }

        // 個別に要素をインスタンス化
        bookArray[0] = new Book("Java言語入門", "たろう", 1000);
        bookArray[1] = new Book("C言語入門", "じろう", 2000);
        bookArray[2] = new Book("Kotlin入門", "はなこ", 3000);
        bookArray[3] = new Book("PHP入門", "たけし", 4000); // ArrayIndexOutOfBoundsException

        // 各要素のprintInfoを実行
        for (int i=0; i<bookArray.length; i++) {
            bookArray[i].printInfo();
        }

        // forで要素をインスタンス化
        for (int i=0; i<bookArray.length; i++) {
            int num = i+1;
            bookArray[i] = new Book("タイトル"+num, "著者"+num, 1000*num);
        }

        for (int i=0; i<bookArray.length; i++) {
            bookArray[i].printInfo();
        }
    }

}
