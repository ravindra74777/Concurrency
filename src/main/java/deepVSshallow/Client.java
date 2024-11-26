package deepVSshallow;

public class Client {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setAge(22);
        s1.setGradeYear(2023);
        s1.setName("Ravindra");
        Exam e1 =new Exam(1,99);
        s1.setInternalExam(e1);

        Student s2 = new Student(s1);
        s2.setAge(33);
        s2.setName("Ravi");



    }
}
