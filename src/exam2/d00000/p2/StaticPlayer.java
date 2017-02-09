package exam2.d00000.p2;

public class StaticPlayer implements JankenPlayer {
    public String name;
    public int[] hand;

    public StaticPlayer(String name, int hand1, int hand2, int hand3) {
        this.name = name;
        hand = new int[] { hand1, hand2, hand3};
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHand(int t) {
        return hand[t];
    }

}
