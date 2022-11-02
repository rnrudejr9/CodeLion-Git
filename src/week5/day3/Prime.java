package week5.day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Prime {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2;i<51;i++){
            list.add(i);
        }
        int index = 1;
        for(int i = 0; i<list.size();i++){
            if(list.get(i) % 2 == 0 && list.get(i) > 2){
                list.remove(i);
            }
        }

        System.out.println(Arrays.toString(list.toArray()));
    }
}
