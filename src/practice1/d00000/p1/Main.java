package practice1.d00000.p1;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        System.out.println("四角r1の面積は"+r1.getArea()+"です。");
        if (r1.isSquare()) {
            System.out.println("正方形です。");
        } else {
            System.out.println("正方形ではありません。");
        }
    }
}