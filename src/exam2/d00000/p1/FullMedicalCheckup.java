package exam2.d00000.p1;

public class FullMedicalCheckup extends MinimumMedicalCheckup {
    public int age;
    public boolean male;

    public FullMedicalCheckup(double height, double weight) {
        super(height, weight);
        age = 18;
        male = true;
    }

    public FullMedicalCheckup(double height, double weight, int age, boolean male) {
        super(height, weight);
        this.age = age;
        this.male = male;
    }

    public double getBme() {
        if (male) {
            return 13.397 * weight + 4.799 * height * 100 - 5.677 * age + 88.362;
        } else {
            return 9.247 * weight + 3.098 * height * 100 - 4.33 * age + 447.593;
        }
    }

    @Override
    public String getBmiClass() {
        double bmi = getBmi();
        if (bmi < 16.0) {
            return "痩せすぎ";
        } else if (bmi < 17.0) {
            return "痩せ";
        } else if (bmi < 18.5) {
            return "痩せぎみ";
        } else if (bmi < 25.0) {
            return "普通体重";
        } else if (bmi < 30.0) {
            return "肥満予備軍";
        } else {
            return "肥満";
        }
    }
}
