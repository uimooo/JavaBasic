package practice;

public class Practice11 {
public static void main(String[] args) {

/*
「1 から9の」数値が入力された場合、合計に加算して再度入力を受け付けてください。
「0 から9以外の」数値が入力された場合、「0から9の数値を入力して下さい。」と表示し、合計に加算せずに再度入力を受け付けてください。
数値の「0」が入力された場合、「合計値は ○○ です。」と出力して繰り返しを終了してください。
繰り返しはwhile文を使って行い、break文 、continue文を必ず使用して下さい。
 */


	int i=0;
	int sum=0;
	System.out.println("入力された数値を合計します。1から9の数値を入力して下さい。0を入力したら計算結果を表示します。");

	while(true) {
	i= new java.util.Scanner(System.in).nextInt();


	if(i <0 || i>9 ) {
		System.out.println("0から9の数値を入力して下さい。");
		continue;
	}
	if(i==0) {
		break;
	}
	sum=sum+i;
	}
	System.out.println("合計値は"+ sum+"です。");

	}
}
