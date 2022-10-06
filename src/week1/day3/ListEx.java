package week1.day3;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    private List<String> student;

    public ListEx(){
        student = new ArrayList<String>();
        this.student.add("김경록");
        this.student.add("허정식");
        this.student.add("구경덕");
    }

    public List<String> getStudent(){
        return this.student;
    }
}
