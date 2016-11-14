package practice1.d00000.p2;

public class Main {
    public static void main(String[] args) {
        BlackjackHand hand = new BlackjackHand(1,12);
        System.out.println("スコア: "+hand.getScore());
        System.out.println("1枚目のカード: "+hand.card1);
        System.out.println("2枚目のカード: "+hand.card2);
    }
}