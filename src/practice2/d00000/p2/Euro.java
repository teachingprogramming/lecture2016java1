package practice2.d00000.p2;

public class Euro implements YenEquivalent {
    public int euro;

    public Euro(int euro) {
        this.euro = euro;
    }

    @Override
    public int getYen() {
        return euro * 120;
    }
}
