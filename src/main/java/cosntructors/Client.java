package cosntructors;

public class Client {
    public static void main(String[] args) {
        Student s = new Student(32,2023);
        System.out.println("student graduate year " + s.gradeYear);

        Student s1 = new Student();
        s1.setAge(22);
        s1.setGradeYear(2023);

         // this below statement copying the reference of s1
         //  Student s2 = s1;

        Student  s2 = new Student();

        s2.setAge(s1.getAge());
        s2.setGradeYear(s1.getGradeYear());

        Student s3 = new Student(s2);

        System.out.println(s3.getAge());
        System.out.println(s3.getGradeYear());
    }
}
