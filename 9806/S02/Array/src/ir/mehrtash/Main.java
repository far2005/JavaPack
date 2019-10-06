package ir.mehrtash;

public class Main {

    public static void main(String[] args) {
        int numbers[] = {10,15,20,18,19,11,10};
        float sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sum+=  numbers[i];
        }
        System.out.println(  sum/numbers.length );
    }
}
