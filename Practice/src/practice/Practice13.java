package practice;

public class Practice13 {
public static void main(String[] args) {

	 int[][] score = {
             { 95, 88, 87},          // 0列目
             { 70, 81, 100},     // 1列目
             { 12, 98, 90} // 2列目
     };

	 /*
     System.out.println(score[0][0]+score[0][1]+score[0][2]);    // 0列目の0番目
     System.out.println(score[1][0]+score[1][1]+score[1][2]);    // 1列目の1番目
     System.out.println(score[2][0]+score[2][1]+score[2][2]);    // 2列目の3番目
     */

	 for (int[] number : score) {
         int sum = 0;
         for (int i : number) {
             sum += i;
         }
         System.out.println(sum);
     }

 }


}
