package practice09;
/*
 * PTra09_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra09_01 {
	public static void main(String[] args) {

		// ★ 変数strを、Util内のメソッドを用いて0.5秒間隔で表示させなさい
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです


        String str = "この文字列をゆっくり表示したい";

        // 文字列を配列に１文字ずつセット
        char data[] = str.toCharArray();

        // 配列数を取得
        int arr_num = data.length;

        for (int i = 0; i <= arr_num-1; i++) {

            try{

                Thread.sleep(500);
            }
            catch(InterruptedException e){
            }

            System.out.print(data[i]);
        }
	}
}
