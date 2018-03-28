package practice.practice21;

public class Sample {
    public static void main(String[] args) {
        try {
            System.out.println(numCheck(10));
            System.out.println(numCheck(-2));

        } catch (RuntimeException e) {
            System.out.println("RuntimeExceptionが発生しました");
        }
    }

    public static int numCheck(int num) {
        if (0 > num) {
            throw new RuntimeException();
        }
        return num;
    }

}
