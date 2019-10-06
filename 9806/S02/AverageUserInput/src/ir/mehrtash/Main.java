package ir.mehrtash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        //int inp = 1;
        int inp ;
        float sum = 0;
        float avg = 0;
        int count = 0;

        /*
        while (inp != 0) {
            System.out.print("Enter a number:");
            inp = scn.nextInt();
            if (inp != 0) {
                sum += inp;
                count++;
            }
        }
         */
        do{
            System.out.print("Enter a number:");
            inp = scn.nextInt();
            if (inp != 0) {
                sum += inp;
                count++;
            }

        }while ( inp!=0 ) ;



        avg = sum / count;

        System.out.println(avg);


    }
}
