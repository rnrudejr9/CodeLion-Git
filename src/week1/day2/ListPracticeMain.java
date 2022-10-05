package week1.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeMain {
    public static void main(String[] args) {
        ListPractice list = new ListPractice();
        List<Student> students = list.getStudentList();


        for(Student student: students){
            System.out.println(student.getName() + student.getClassNo() + student.getGitRepositoryAddress());
        }


    }
}
