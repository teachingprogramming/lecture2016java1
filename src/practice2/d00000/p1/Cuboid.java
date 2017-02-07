package practice2.d00000.p1;

public class Cuboid extends Rectangle {
    public int z;

    public Cuboid(int x, int y) {
        super(x, y);
        this.z = 1;
    }

    public Cuboid(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getVolume() {
        return super.getArea() * z;
    }

    @Override
    public int getArea() {
        return super.getArea() * 2 + y * z * 2 + z * x * 2;
    }
}
