package ir.mehrtash;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        int tmp;

        do {
            tmp = scn.nextInt();
            if (tmp > 0) {
                numberList.add(tmp);
            }
        } while (tmp > 0);


        for (int i = numberList.size() - 1; i >= 0; i--) {
            System.out.println(numberList.get(i));
        }


    }
}
