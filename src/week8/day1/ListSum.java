package week8.day1;


import java.util.ArrayList;
import java.util.List;

public class ListSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        System.out.println(listSum(list));
    }
    public static int listSum(List<Integer> list){
        if(list.isEmpty()){
            return 0;
        }
        return list.remove(list.size()-1) + listSum(list);
    }
}
