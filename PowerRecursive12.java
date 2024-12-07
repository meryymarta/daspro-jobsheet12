import java.util.Scanner;
public class PowerRecursive12 {
    static int calculatePower(int base, int pow){
        if(pow ==0)
            return 1;
        else
            return base * calculatePower(base, pow-1);
    }

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = input12.nextInt();
        System.out.print("Input Power Number: ");
        int power = input12.nextInt();

        System.out.println("Result of " +base+ " power " + power+ " = " +
        calculatePower(base, power));
    }

    
}