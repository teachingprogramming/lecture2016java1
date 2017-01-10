package reexam1.d00000.p1;

public class Main {
    public static void main(String[] args) {
        // 手紙1
        Letter letter1 = new Letter();
        if (letter1.isStandard()) {
            System.out.println("手紙1は定形郵便物で、料金は" + letter1.getFreight() + "円です。");
        } else {
            System.out.println("手紙1は定形郵便物ではありません。");
        }
        // 手紙2
        Letter letter2 = new Letter(200, 5, 100, 45);
        if (letter2.isStandard()) {
            System.out.println("手紙2は定形郵便物で、料金は" + letter2.getFreight() + "円です。");
        } else {
            System.out.println("手紙2は定形郵便物ではありません。");
        }
        // 手紙3
        Letter letter3 = new Letter(200, 5, 130, 15);
        if (letter3.isStandard()) {
            System.out.println("手紙3は定形郵便物で、料金は" + letter3.getFreight() + "円です。");
        } else {
            System.out.println("手紙3は定形郵便物ではありません。");
        }
    }
}