package exam1.d00000.p2;

public class Main {
    public static void main(String[] args) {
        HeightPredictor heightPredictor1 = new HeightPredictor();
        System.out.println(heightPredictor1.getParentsInfo());
        System.out.println("男の子の予想身長は" + heightPredictor1.predict(true) + "cmです。");
        System.out.println("女の子の予想身長は" + heightPredictor1.predict(false) + "cmです。");

        HeightPredictor heightPredictor2 = new HeightPredictor(181.2, 153.4);
        System.out.println(heightPredictor2.getParentsInfo());
        System.out.println("男の子の予想身長は" + heightPredictor2.predict(true) + "cmです。");
        System.out.println("女の子の予想身長は" + heightPredictor2.predict(false) + "cmです。");
    }
}