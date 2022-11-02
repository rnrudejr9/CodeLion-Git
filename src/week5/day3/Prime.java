package week5.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Prime {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<51;i++){
            list.add(i);
        }
        int index = 1;
        while(2*index < list.size()-2){
            int a = list.indexOf(2*index);
            list.remove(a);
        }

        System.out.println(Arrays.toString(list.toArray()));
    }
}
