package ir.mehrtash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scnObj = new Scanner( System.in );

        int a,b;

        System.out.print("Enter a: ");
        a = scnObj.nextInt();

        System.out.print("Enter b: ");
        b = scnObj.nextInt();

        System.out.println( "Result is: " + (a*b) );


    }
}
