import java.util.Scanner;
public class PrimeCheckingRecursive {
    public static boolean isPrimeRecursive(int n, int divisor){
       
        if (n <= 1){
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if(n % divisor == 0){
        return false;
        }
    return isPrimeRecursive(n, divisor-1);
}
public static boolean isPrime(int n){
    return isPrimeRecursive(n, n-1);
}
//call the function
public static void main(String[] args) {
    Scanner input12 = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input12.nextInt();

    if (isPrime(number)){
        System.out.println(number + " this is a prime number");
    }else {
        System.out.println(number + " this is not prime number");
    }
    }

}
    
    

