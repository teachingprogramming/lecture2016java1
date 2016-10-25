class Lecture03 {
    public static void main(String[] args) {
        // クラスを使わない例
        double taro_height = 1.7; // タローの身長
        double taro_weight = 70.0; // タローの体重

        double jiro_height = 1.9; // ジローの身長
        double jiro_weight = 80.0; // ジローの体重

        double taro_bmi = taro_weight / (taro_height * taro_height);
        System.out.println("タローのBMIは" + taro_bmi + "です。");

        double jiro_bmi = jiro_weight / (jiro_height * jiro_height);
        System.out.println("ジローのBMIは" + jiro_bmi + "です。");

        // クラスを使う例
        Body taro = new Body(); // タローの身体データを表すBodyクラスのインスタンスを生成
        taro.height = 1.7; // インスタンスのheightフィールドに代入
        taro.weight = 70.0; // インスタンスのweightフィールドに代入

        Body jiro = new Body(); // ジローの身体データを表すBodyクラスのインスタンスを生成
        jiro.height = 1.9; // インスタンスのheightフィールドに代入
        jiro.weight = 80.0; // インスタンスのweightフィールドに代入

        System.out.println("タローのBMIは" + taro.getBmi() + "です。");

        System.out.println("ジローのBMIは" + jiro.getBmi() + "です。");
    }


}
