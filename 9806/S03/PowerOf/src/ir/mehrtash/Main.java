package ir.mehrtash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        int r = powerof(a, b);

        System.out.println(r);

    }


    public static int powerof(int base, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result*=base;
        }
        return result;
    }


}
