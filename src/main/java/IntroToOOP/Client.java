package IntroToOOP;

public class Client {
    public static void main(String[] args) {

     Student s = new Student();
     s.name="Ravindra";
     s.batch= "AcademyNov23";
     s.gradeYear = 2016;
     s.psp = 90;
     //s.age  =10 ; private variable can not accessable to other classes directly
     int age = s.getAge();

     s.setAge(age);

     s.addendClass();

        Student t = new Student();
        s.name="Ravindra";
        s.batch= "AcademyNov23";
        s.gradeYear = 2017;

        t = s;

        s.psp = 95;
        System.out.println("Student name " + t.name);

    }
}
