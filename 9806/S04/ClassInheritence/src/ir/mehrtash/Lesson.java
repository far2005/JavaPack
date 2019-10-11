package ir.mehrtash;

public class Lesson {

    private String lessonName;
    private int credit;
    private float grade;


    public Lesson(String lessonName, int credit, float grade) {
        this.lessonName = lessonName;
        this.credit = credit;
        this.grade = grade;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
