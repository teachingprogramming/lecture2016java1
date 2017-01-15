package reexam1.d00000.p1;

public class Letter {
    public int lengthA;
    public int lengthB;
    public int lengthC;
    public int weight;

    public Letter(int lengthA, int lengthB, int lengthC, int weight) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
        this.weight = weight;
    }

    public Letter() {
        this.lengthA = 148;
        this.lengthB = 0;
        this.lengthC = 100;
        this.weight = 3;
    }

    public boolean isStandard() {
        return  140 <= lengthA && lengthA <= 235 && lengthB <= 10 && 90 <= lengthC && lengthC <= 120 && weight <= 50;
    }

    public int getFreight() {
        if (isStandard()) {
            if (weight <= 25) {
                return 82;
            } else {
                return 92;
            }
        } else {
            return 0;
        }
    }
}
