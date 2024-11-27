package Polymorphism;

public class Client {

    public static void main(String[] args) {

        User u = new User();

        Student student = new Student();

        Instructor instructor = new Instructor();

        User u1 = new Instructor();

        UserUtility.changePassword(u1);
        UserUtility.changePassword(u);
        UserUtility.changePassword(student);

    }
}

