package lesson12.d00000;

/**
 * 量り売りの弁当（惣菜）
 */
public class BoxedLunch implements Product {
    private String name; // 商品名
    private int unitPrice; // 100グラムあたりの値段
    private int amount; // 購入する量（グラム）

    public BoxedLunch(String name, int unitPrice, int amount) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    @Override
    public int getPrice() {
        return (int)(unitPrice/100.0 * amount);
    }

    @Override
    public String getName() {
        return name + "（" + amount + "グラム）";
    }

}
