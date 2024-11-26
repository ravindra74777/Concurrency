package IntroToOOP;

public class Student {
   public String name;
   public double psp;
   int gradeYear ;
   String batch ;

   private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 2000) {
            this.salary = salary;
        }else {
            throw new RuntimeException("Invalid Salary");
        }
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    void addendClass(){
        System.out.println("Student name " + name + "is attend class");
    }

    void display(){
        System.out.println("My name is " + this.name + ". I am "  + this.age + " years old");
    }
}
