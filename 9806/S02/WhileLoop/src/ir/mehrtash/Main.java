package ir.mehrtash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        int inp = 0;

        while (inp != 10) {
            inp = scn.nextInt();
            if (inp != 10)
                System.out.println(inp);
        }


    }
}
