package lesson12.d00000;

import java.util.ArrayList;

public class CashRegister {
    private ArrayList<Product> productList;

    public CashRegister() {
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(Product p) {
        productList.add(p);
    }

    public void clear() {
        this.productList.clear();
    }

    public void printReceipt() {
        int total = 0;
        for (Product p : productList) {
            System.out.println(p.getName() + "\t" + p.getPrice() + "円");
            total += p.getPrice();
        }
        int tax = (int)(0.08 * total);
        System.out.println("------------------------");
        System.out.println("小計" + "\t" + total + "円");
        System.out.println("税" + "\t" + tax + "円");
        System.out.println("合計" + "\t" + (total + tax) + "円");
    }

}
