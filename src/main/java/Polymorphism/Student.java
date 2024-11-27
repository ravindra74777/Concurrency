package Polymorphism;

public class Student extends User{
    private String course;

    public Student(){
        this.course = "Scalar Academy";
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public void doSomething(){
        super.login();
    }
}
