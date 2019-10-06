package ir.mehrtash;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter A: ");
        int inp = scn.nextInt();
        System.out.print("Enter B: ");
        int inp2 = scn.nextInt();

        if( inp == 1 && inp2==1){
            System.out.println("Hi");
        }else if(inp==2 && inp2 == 3){
            System.out.println("Hello");
        }else if(inp==3 && inp2 == 2){
            System.out.println("Hey");
        }else{
            System.out.println("Error");
        }





    }
}
