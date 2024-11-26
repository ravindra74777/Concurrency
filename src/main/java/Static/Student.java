package Static;

public class Student {
    private int id;
    private int age;
    private int gradeYear;
    public static int countStudent=0;
    private int count=0;

    Student(int age, int gradeYear){
        this.count++;
        countStudent++;
        this.id = countStudent;
        this.age = age;
        this.gradeYear = gradeYear;

    }
}
