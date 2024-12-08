import java.util.Scanner;
public class SummationRecursive12 {
    static int calculateSum(int n){
        if(n==1) return 1;
        return n + calculateSum(n-1);
    }

    //call function calculateSum
    public static void main(String[] args) {
    int n = 8;
    System.out.println("The sum of numbers from 1 to " + n + " is "
    + calculateSum(n));
    }
}