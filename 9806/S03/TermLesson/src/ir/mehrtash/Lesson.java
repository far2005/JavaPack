package ir.mehrtash;

public class Lesson {
    private String name;
    private int unit;
    private float grade;


    public Lesson(String name, int unit, float grade) {
        setName(name);
        setUnit(unit);
        setGrade(grade);
    }

    public Lesson(){

    }

    public float calculateScore(){
        return grade*unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
