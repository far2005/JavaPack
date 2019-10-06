package ir.mehrtash;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Lesson> lessonList = new ArrayList<>();

        Lesson tmp = new Lesson("Madar manteghi",3,10);

        lessonList.add(tmp);

        tmp =new Lesson("Riyazi 2",3,10);
        lessonList.add(tmp);

        tmp =new Lesson("Fizik 1",3,10);
        lessonList.add(tmp);

        tmp =new Lesson("Assembly",3,10);
        lessonList.add(tmp);

        tmp =new Lesson("Vasaya",2,20);
        lessonList.add(tmp);

        tmp =new Lesson("Andishe 1",2,20);
        lessonList.add(tmp);

        tmp =new Lesson("Barname Nevisi Moghadami",4,20);
        lessonList.add(tmp);


        float sumScore=0;
        int sumUnit = 0;
        for (int i = 0; i < lessonList.size(); i++) {
            sumScore += lessonList.get(i).calculateScore();
            sumUnit+= lessonList.get(i).getUnit();
        }


        System.out.println( sumScore/sumUnit );


    }







}
