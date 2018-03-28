package practice;

public class practice14 {
    public static void main(String[] args) {
        printStar(10);
    }

    // 任意の回数「★」を出力する。
    public static void printStar(int count) {
        for(int i = 0; i < count; i++) {
            System.out.print("★");
        }
    }
}

