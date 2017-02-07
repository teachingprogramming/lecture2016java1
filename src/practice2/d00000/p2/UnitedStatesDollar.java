package practice2.d00000.p2;

public class UnitedStatesDollar implements YenEquivalent {
    public int dollar;

    public UnitedStatesDollar(int dollar) {
        this.dollar = dollar;
    }

    @Override
    public int getYen() {
        return dollar * 112;
    }
}
