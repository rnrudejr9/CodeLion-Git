package week1.day2;

public class Student {
    public Student(int classNo,String name, String gitRepositoryAddress) {
        this.classNo = classNo;
        this.name = name;
        this.gitRepositoryAddress = gitRepositoryAddress;
    }

    private int classNo;
    private String name;
    private String gitRepositoryAddress;
    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGitRepositoryAddress() {
        return gitRepositoryAddress;
    }

    public void setGitRepositoryAddress(String gitRepositoryAddress) {
        this.gitRepositoryAddress = gitRepositoryAddress;
    }


}
