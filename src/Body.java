class Body {
    double weight; // 体重を表すフィールド
    double height; // 身長を表すフィールド

    // BMIを計算するメソッド
    double getBmi() {
        double bmi = weight / (height * height);
        return bmi;
    }

    /**
     * 身長をセンチでセットするメソッド
     */
    void setHeightAsCm(double cm) {
        height = cm / 100.0;
    }

    /**
     * 体重と身長を1度に設定するメソッド
     */
    void setWeightAndHeight(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    /**
     * 引数が2つあるコンストラクタ
     */
    Body(double weight, double height) {
        this.weight = weight;
        this.height = height;
        // setWeightAndHeight(double weight, double height)
    }

    /**
     * 引数がないコンストラクタ
     */
    Body() {
        this.weight = 50.0 + Math.random() * 50.0;
        this.height = 1.5 + Math.random() * 0.5;
    }

}
