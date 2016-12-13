package lesson09.d00000;

import lesson05.d00000.Book;

import java.util.ArrayList;

public class MainList {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        Book book1 = new Book("タイトル1", "著者1", 1000);
        bookList.add(book1);
        Book book2 = new Book("タイトル2", "著者2", 2000);
        bookList.add(book2);
        bookList.add(new Book("タイトル3", "著者3", 3000));

        System.out.println(bookList.size() + "冊のデータがあります。");
        for (int i=0; i<bookList.size(); i++) {
            Book b = bookList.get(i); // リストの中からi番目を取り出す
            b.printInfo();
        }

        bookList.add(new Book("タイトル4", "著者4", 4000));
        System.out.println(bookList.size() + "冊のデータがあります。");
        for (int i=0; i<bookList.size(); i++) {
            bookList.get(i).printInfo();
        }

        bookList.clear();
        System.out.println(bookList.size() + "冊のデータがあります。");
        for (int i=0; i<bookList.size(); i++) {
            bookList.get(i).printInfo();
        }
    }

}
