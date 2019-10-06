package ir.mehrtash;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> gradeList = new ArrayList<>();

        gradeList.add(10);
        gradeList.add(15);
        gradeList.add(20);

        for (int i = 0; i < gradeList.size() ; i++) {
            System.out.println(  gradeList.get(i) );
        }




    }
}
