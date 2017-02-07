package practice2.d00000.p2;

import java.util.ArrayList;
import java.util.List;

public class CoinBank2 {
    public List<YenEquivalent> moneyList;

    public CoinBank2() {
        moneyList = new ArrayList<YenEquivalent>();
    }

    public void put(YenEquivalent money) {
        moneyList.add(money);
    }

    public int getTotal() {
        int total = 0;
        for (YenEquivalent money : moneyList) {
            total += money.getYen();
        }
        return total;
    }

}
