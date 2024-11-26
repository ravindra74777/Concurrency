package Inheritance;

public class Student extends User{
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(){
        course = "Scalar Academy";
        setName("Ravindra");
        System.out.println("Student Constructor is being called after parent class User constructor called");
    }

    public void doSomething(){
        super.login();
    }

}
