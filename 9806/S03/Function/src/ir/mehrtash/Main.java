package ir.mehrtash;

public class Main {

    public static void main(String[] args) {
/*
        int b = doubler(2);
        System.out.println(b);
*/

        int b = multiplier(2, 4);
        System.out.println(b);

        String a = t2();
        System.out.println(a);


    }

    public static void t3(){

    }

    public static String t2(){
        return "Hello World";
    }

    public static void t1(int a){

    }

    public static int multiplier(int a, int b) {
        return a * b;
    }

    public static int doubler(int a) {
        return a * 2;
    }


}
