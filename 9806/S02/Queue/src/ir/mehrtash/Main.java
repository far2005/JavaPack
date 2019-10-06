package ir.mehrtash;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {


        Queue<String> nameQ = new LinkedList<>();


        nameQ.add("Abbas");
        nameQ.add("Reza");

        System.out.println(  nameQ.peek() );
        System.out.println(  nameQ.poll() );
        System.out.println(  nameQ.poll() );





    }
}
