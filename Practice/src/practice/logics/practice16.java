package practice.logics;

public class practice16 {
    public static void main(String[] args) {
        int age = new java.util.Scanner(System.in).nextInt();

        boolean result = practiceLogic16.checkChild(age);

        if (result) {
            System.out.println("子供");
        } else {
            System.out.println("大人");
        }
    }

}
