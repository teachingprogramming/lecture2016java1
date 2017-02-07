package practice2.d00000.p2;

public class JapaneseYen implements YenEquivalent {
    public int yen;

    public JapaneseYen(int yen) {
        this.yen = yen;
    }

    @Override
    public int getYen() {
        return yen;
    }
}
