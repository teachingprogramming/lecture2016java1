package exam2.d00000.p2;

public class SimplePlayer implements JankenPlayer {
    public String name;
    public int hand;

    public SimplePlayer(String name, int hand) {
        this.name = name;
        this.hand = hand;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHand(int t) {
        return hand;
    }
}