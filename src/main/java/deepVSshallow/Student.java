package deepVSshallow;

public class Student {
    private int age;
    private int gradeYear;
    private String name;

    private Exam internalExam;

    Student(){

    }

    // shallow copy
    /*Student(Student other){
        this.age = other.age;
        this.gradeYear = other.getGradeYear();
        this.name = other.name;
        this.internalExam = other.internalExam;
    }*/

    // deep copy

    Student(Student other){
        this.age = other.age;
        this.gradeYear = other.getGradeYear();
        this.name = other.name;

        this.internalExam = new Exam(other.internalExam);

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Exam getInternalExam() {
        return internalExam;
    }

    public void setInternalExam(Exam internalExam) {
        this.internalExam = internalExam;
    }
}
