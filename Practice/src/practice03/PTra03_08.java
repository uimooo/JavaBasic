package practice03;
/*
 * PTra03_08.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_08 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("1-3を選択してください");
		System.out.println("------------------------------------------");
		System.out.println("*　1.オレンジジュース	：150円");
		System.out.println("*　2.リンゴジュース		：160円");
		System.out.println("*　3.コーヒー			：200円");
		System.out.println("------------------------------------------");

		// コマンドプロンプトで入力した数値が変数numに代入されます
		// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになります
		int num = scanner.nextInt();

		int money = 1000;	// 所持金

		//---------------------ここから本題-----------------------
		/*
		 * ★ 以下の仕様に沿ってプログラムを完成させてください
		 *
		 * ●入力された値に対応した商品を購入
		 * ●所持金から、対応した商品の値段分を引く
		 * ●最後に所持金を表示してプログラム終了
		 *
		 * ※ プログラムは何行書いても良いです
		 */

		System.out.println("所持金："+money+"円");
	       switch (num) {
           case 1:
               System.out.println("おつり："+(money-150)+"円");
               break;
           case 2:
               System.out.println("おつり："+(money-160)+"円");
               break;
           case 3:
               System.out.println("おつり："+(money-200)+"円");
               break;
           default:
               System.out.println("1-3を選択してください");
       }

	}
}
