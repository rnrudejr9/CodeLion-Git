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
        System.out.println(listSum(list,0));
    }
    public static int listSum(List<Integer> list,int sum){
        if(list.isEmpty()){
            return sum;
        }
        sum += list.get(list.size()-1);
        list.remove(list.size()-1);
        return listSum(list,sum);
    }
}
