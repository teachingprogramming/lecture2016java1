package exam1.d00000.p2;

public class HeightPredictor {
    public double father;
    public double mother;

    public HeightPredictor() {
        this.father = 175.0;
        this.mother = 160.0;
    }

    public HeightPredictor(double father, double mother) {
        this.father = father;
        this.mother = mother;
    }

    public String getParentsInfo() {
        return "父の身長は" + father + "cmです。母の身長は" + mother + "cmです。";
    }

    public double predict(boolean boy) {
        double height;
        if (boy) {
            height = (father + mother + 13)/2 + 2;
        } else {
            height = (father + mother - 13)/2 + 2;
        }
        return height;
    }
}