package practice.practice22;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(100);
        list.add(200);
        for(int num : list){
            System.out.println(num);
        }
    }
}

