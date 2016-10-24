class Body {
    double weight; // 体重を表すフィールド
    double height; // 身長を表すフィールド

    // BMIを計算するメソッド
    double getBmi() {
        double bmi = weight / (height * height);
        return bmi;
    }
}
