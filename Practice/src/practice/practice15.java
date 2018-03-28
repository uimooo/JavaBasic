package practice;

public class practice15 {
    public static void main(String[] args) {
        double bmi = getBmi(1.7, 60);
        checkBmi(bmi);
    }

    // BMIを算出します
    public static double getBmi(double height, int weight) {
        double bmi = weight / (height * height);
        return bmi;
    }

    // BMIをもとに肥満度をチェックします。
    public static void checkBmi(double bmi) {
        if (18 > bmi) {
            System.out.println("低体重");
        } else if(25 > bmi) {
            System.out.println("普通体重");
        } else {
            System.out.println("肥満");
        }
    }

}
