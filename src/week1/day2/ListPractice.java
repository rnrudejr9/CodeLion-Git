package week1.day2;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    private List<String> students;

    public ListPractice() {
        students = new ArrayList<>();
        GenerateName g = new GenerateName();
        for(int i = 0; i<99;i++) {
            this.students.add(g.generateName());
        }
    }

    // 멋사자 2기 학생의 이름이 들어있는 리스트를 리턴하는 메소드
    public List<String> getStudentList(){
        return this.students;
    }
}
