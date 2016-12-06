package exam1.d00000.p1;

public class Parcel {
    public int lengthA;
    public int lengthB;
    public int lengthC;
    public int weight;

    public Parcel(int lengthA, int lengthB, int lengthC, int weight) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
        this.weight = weight;
    }

    public Parcel() {
        this.lengthA = 20;
        this.lengthB = 40;
        this.lengthC = 60;
        this.weight = 10;
    }

    public boolean isAcceptable() {
        int total = lengthA + lengthB + lengthC;
        return weight <= 30 && total <= 170;
    }

    public int getFreight() {
        int total = lengthA + lengthB + lengthC;
        int freight = -1;
        if (total <= 60) {
            freight = 690;
        } else if (total <= 80) {
            freight = 900;
        } else if (total <= 100) {
            freight = 1130;
        } else if (total <= 120) {
            freight = 1340;
        } else if (total <= 140) {
            freight = 1560;
        } else if (total <= 160) {
            freight = 1780;
        } else if (total <= 170) {
            freight = 2070;
        }
        return freight;
    }
}