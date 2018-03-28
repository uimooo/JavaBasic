package practice09;
/*
 * PTra09_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

//public class PTra09_02 {
//	public static void main(String[] args) {
//		String[] array = {"Plain", "Island", "Mountain", "Swamp", "Forest"};

// ★ 配列arrayを、Util内のメソッドを用いてランダムに並び替えてください
// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです
// ★ ランダムに並び替えた後の配列を前から順に全て表示してください

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PTra09_02 {
public static void main(String[] args) {
List<String> list = new ArrayList<String>();

list.add("Plain");
list.add("Island");
list.add("Mountain");
list.add("Swamp");
list.add("Forest");

// ArrayListの中身をバラバラにする
Collections.shuffle(list);

// ArrayListの中身を全表示
for( String s : list ){
System.out.println( s );
}
}
}
