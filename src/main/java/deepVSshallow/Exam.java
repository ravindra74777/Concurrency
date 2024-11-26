package deepVSshallow;

public class Exam {
    private int id;
    private double score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    Exam(Exam e){
        this.id = e.id;
        this.score = e.score;
    }

    Exam(int id, double score){
        this.id = id;
        this.score = score;
    }
}
