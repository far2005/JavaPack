package ir.mehrtash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        String tempName, tempFamily, tempNatCode, tempStudentCode, tempLessonName;
        int tempCredit;
        float tempGrade;

       /* System.out.print("Please enter first name:");
        tempName = scn.nextLine();

        System.out.print("Please enter last name:");
        tempFamily = scn.nextLine();

        System.out.print("Please enter nat code:");
        tempNatCode = scn.nextLine();

        System.out.print("Please enter student code:");
        tempStudentCode = scn.nextLine();*/

        tempName = "Abbas";
        tempFamily = "Reza";
        tempNatCode = "22323";
        tempStudentCode = "32424";

        Student stObj = new Student(tempName, tempFamily, tempNatCode, tempStudentCode);


        while (stObj.getTotalCredit() < 20) {
            System.out.print("Please enter lesson name:");
            tempLessonName = scn.nextLine();

            System.out.print("Please enter lesson credit:");
            tempCredit = Integer.parseInt(scn.nextLine());

            System.out.print("Please enter lesson grade:");
            tempGrade = Float.parseFloat(scn.nextLine());


            Lesson tmp = new Lesson(tempLessonName, tempCredit, tempGrade);
            stObj.addLessonList(tmp);


            System.out.println("Total credit entered:" + stObj.getTotalCredit());
            System.out.println("=====");




        }


        System.out.println(stObj.getTotalCredit());
        System.out.println(stObj.getTotalScore());
        System.out.println(stObj.getTermAvg());


    }

