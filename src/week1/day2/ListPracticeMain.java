package week1.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        ListPractice list = new ListPractice();
        List<String> students = list.getStudentList();


        for(String student: students){
            System.out.println(student);
        }


    }
}
