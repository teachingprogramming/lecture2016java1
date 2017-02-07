package practice2.d00000.p2;

public class Main {
    public static void main(String[] args) {
        CoinBank coinBank = new CoinBank();
        coinBank.put(new JapaneseYen(100)); // 100円を貯金
        coinBank.put(new UnitedStatesDollar(5)); // 5ドルを貯金
        coinBank.put(new Euro(20)); // 20ユーロを貯金
        coinBank.put(new UnitedStatesDollar(15)); // 15ドルを貯金
        System.out.println("貯金額: " + coinBank.getTotal() + "円");
    }
}
