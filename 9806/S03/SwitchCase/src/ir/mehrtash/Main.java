package ir.mehrtash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        switch (n) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
            case 4:
                System.out.println("Bye");
                break;

            case 3:
                System.out.println("How Are you?");
                break;

            default:
                System.out.println("Good Bye");
                break;
        }


    }
}
