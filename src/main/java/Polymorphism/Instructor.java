package Polymorphism;

public class Instructor extends User{
    private String subject;

    public Instructor(){
        this.subject = "Backend";

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
