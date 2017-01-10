package lesson10.d00000;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();

        // 数値を入力
        while (true) {
            System.out.print("数値かquitを入力: ");
            String input = scanner.next();
            if (input.equals("quit")) {
                break;
            } else {
                int num = Integer.parseInt(input);
                numList.add(num);
            }
        }

        // 和と積を計算して表示する
        int sum = 0;
        int product = 1;
        for (int i=0; i<numList.size(); i++) {
            int num = numList.get(i);
            sum += num;
            product *= num;
        }
        System.out.println("和: " + sum);
        System.out.println("積: " + product);
    }
}