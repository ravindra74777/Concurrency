package Inheritance;

public class Client {

    public static void main(String[] args) {

        //User user = new User();

        Student s1 = new Student();
        Instructor I1 = new Instructor();

        User user = new Instructor();
        user.login();

    }
}
