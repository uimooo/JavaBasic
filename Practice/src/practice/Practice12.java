package practice;

public class Practice12 {
public static void main(String[] args) {
	/*配列を 1, 2, 5, 8, 9 で初期化します。
	配列の中から 2の倍数のみ出力してください。*/

	int[]a= {1,2,5,8,9};

	for(int b:a)
	if(b%2==0) {
		System.out.println(b);
	}
}
}
