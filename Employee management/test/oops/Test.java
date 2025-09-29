package oops;


public class Test {
    public static void main(String[] Args) {
        Student st = new Vivek();
        Student sts=new Karan();
        st.SetName("Vivek");
        st.SetRoll_no(04);
        st.SetSchool("Vashist Public School");
        st.Setgrade("7th");
        st.Activity();
        sts.Activity();
        sts.SetName("Karan");
        System.out.println(sts.getGrade());
    }
}
