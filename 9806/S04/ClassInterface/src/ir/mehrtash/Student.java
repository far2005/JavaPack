package ir.mehrtash;

public class Student implements StudetnInterface {

    private String name;
    private int credit;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String tname) {
        name = tname;
    }

    @Override
    public int getTotalCredit() {
        return credit;
    }
}
