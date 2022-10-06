package week1.day3;

import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        ListEx list = new ListEx();

        List<String> student = list.getStudent();
        for(String name : student){
            System.out.println(name);
        }
    }
}
