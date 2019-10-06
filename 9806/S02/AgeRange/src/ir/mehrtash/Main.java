package ir.mehrtash;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int birthYear = scn.nextInt();
        int age;
        String title;
        if (birthYear >= 1400) {
            age = 2019 - birthYear;
        } else {
            age = 1398 - birthYear;
        }

        if (age == 0) {
            title = "Baby";
        } else if (age >= 1 && age < 3) {
            title = "Toddler";
        } else if (age >= 3 && age <= 9) {
            title = "Kid";
        } else if (age >= 10 && age <= 12) {
            title = "Tween";
        } else if (age >= 13 && age < 18) {
            title = "Teenager";
        } else if (age >= 18) {
            title = "Adult";
        } else {
            title = "Error";
        }

        System.out.println(title);


    }
}
