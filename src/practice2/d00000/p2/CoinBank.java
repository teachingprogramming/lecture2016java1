package practice2.d00000.p2;

public class CoinBank {
    public int total;

    public CoinBank() {
        total = 0;
    }

    public void put(YenEquivalent money) {
        total += money.getYen();
    }

    public int getTotal() {
        return total;
    }

}
