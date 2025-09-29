package oops;

public class Student {
    private int roll_no;
    private String name;
    private String school;
    private String grade;

    public void Activity() {
        System.out.println("Student is Studing");
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void SetRoll_no(int n) {
        roll_no = n;
    }

    public String getName() {
        return name;
    }

    public void SetName(String st) {
        name = st;
    }

    public String getSchool() {
        return school;
    }

    public void SetSchool(String sc) {
        school = sc;
    }

    public String getGrade() {
        return grade;
    }

    public void Setgrade(String gds) {
        grade = gds;
    }

}
