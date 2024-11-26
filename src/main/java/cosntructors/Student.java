package cosntructors;

public class Student {

    int age;
    int gradeYear;

    public Student(){

    }

    public Student(int age, int gradeYear){
        this.age =age;
        this.gradeYear = gradeYear;
    }

    public Student(Student others){
        this.age =others.age;
        this.gradeYear = others.gradeYear;
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
}
