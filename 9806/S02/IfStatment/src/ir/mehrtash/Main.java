package ir.mehrtash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        /*
        int d = scn.nextInt();

        if( d >= 18 ){
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }
*/

        String name = scn.next();
/*
        name = name.toLowerCase();
        if (!name.equals("abbas") ) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }
*/

        if (name.equalsIgnoreCase("abbas") ) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }


    }
}
