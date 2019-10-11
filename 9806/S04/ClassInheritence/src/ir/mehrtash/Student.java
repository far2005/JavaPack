package ir.mehrtash;

import java.util.ArrayList;

public class Student extends Person {

    private String studentCode;

    private ArrayList<Lesson> lessonList;

    public Student(String name, String family, String natCode, String stCode) {
        super(name, family, natCode);
        lessonList = new ArrayList<>();
        studentCode = stCode;
    }

    public int getTotalCredit() {
        int total = 0;
        for (Lesson tmp : lessonList) {
            total += tmp.getCredit();
        }
        return total;
    }
    
    public float getTotalScore(){
        float totalScore=0;
        for (Lesson tmp : lessonList) {
            totalScore+= tmp.getCredit() * tmp.getGrade();
        }
        return totalScore;
    }
    
    public float getTermAvg(){
        return getTotalScore()/getTotalCredit();
    }


    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public ArrayList<Lesson> getLessonList() {
        return lessonList;
    }

    public void addLessonList(Lesson lesson) {

        if (getTotalCredit() + lesson.getCredit() <= 20 && lesson.getCredit()>0 ) {
            this.lessonList.add(lesson);

        }
    }
}
