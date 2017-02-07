package practice2.d00000.p1;

public class Main {
    public static void main(String[] args) {
        // Rectangle
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("area: " + rectangle.getArea());

        // Cuboid (1)
        Cuboid cuboid1 = new Cuboid(10, 20);
        System.out.println("volume: " + cuboid1.getVolume());
        System.out.println("area: " + cuboid1.getArea());

        // Cuboid (1)
        Cuboid cuboid2 = new Cuboid(15, 25, 35);
        System.out.println("volume: " + cuboid2.getVolume());
        System.out.println("area: " + cuboid2.getArea());
    }
}
