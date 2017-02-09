package exam2.d00000.p3;

public class VendingMachine {
    public int tea;
    public int cola;
    public int money;

    public VendingMachine(int tea, int cola) {
        this.tea = tea;
        this.cola = cola;
        this.money = 0;
    }

    public boolean buyTea() {
        if (tea > 0) {
            tea--;
            money += 100;
            return true;
        } else {
            return false;
        }
    }

    public boolean buyCola() {
        if (cola > 0) {
            cola--;
            money += 150;
            return true;
        } else {
            return false;
        }
    }

    public int collectAndRestock(int tea, int cola) {
        this.tea += tea;
        this.cola += cola;
        int tmp = money;
        this.money = 0;
        return tmp;
    }

    public String getStatus() {
        return tea + "," + cola + "," + money;
    }

}
