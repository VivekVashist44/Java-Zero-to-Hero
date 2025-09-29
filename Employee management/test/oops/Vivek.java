package oops;

public class Vivek extends Student {
    private String hobbies;
    private String specialization;

    public void Activity() {
        System.out.println("Vivek is Playing");
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String h) {
        hobbies = h;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String sp) {
        specialization = sp;
    }
}
