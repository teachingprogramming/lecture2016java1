package lesson10.d00000;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("入力してください: ");
            String input = scanner.next();
            if (input.equals("quit")) {
                break;
            } else {
                System.out.println("入力された文字: "+input);
            }
        }
    }
}