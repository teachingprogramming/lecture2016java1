package exam1.d00000.p1;

public class Main {
    public static void main(String[] args) {
        // 小包1
        Parcel parcel1 = new Parcel();
        if (parcel1.isAcceptable()) {
            System.out.println("小包1の運賃は" + parcel1.getFreight() +"円です。");
        } else {
            System.out.println("小包1は送ることができません。");
        }
        // 小包2
        Parcel parcel2 = new Parcel(10, 15, 20, 30);
        if (parcel2.isAcceptable()) {
            System.out.println("小包2の運賃は" + parcel2.getFreight() +"円です。");
        } else {
            System.out.println("小包2は送ることができません。");
        }
        // 小包3
        Parcel parcel3 = new Parcel(50, 60, 70, 30);
        if (parcel3.isAcceptable()) {
            System.out.println("小包3の運賃は" + parcel3.getFreight() +"円です。");
        } else {
            System.out.println("小包3は送ることができません。");
        }
    }
}