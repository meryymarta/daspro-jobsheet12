import java.util.Scanner;
public class DesqendingSequenceRecursive12 {
    //recursive function
    static void descendingRecursive(int n) {
        if(n<0)
            return;
            System.out.print(n + " ");
            descendingRecursive(n-1);
    }
    //iterative function
    static void descendingIterative(int n) {
        for(int i = n; i >= 0; i--){
            System.out.print(i+" ");
        }
    }

    //call recursive function and iterative funtion
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input12.nextInt();
       
        System.out.println("using recursive function: ");
        descendingRecursive(n);

        System.out.println("\nusing iterative function:");
        descendingIterative(n);
    }
    
}
