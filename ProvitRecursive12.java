import java.util.Scanner;
public class ProvitRecursive12 {
    static double calculateProfit(double balance, int period) {
        if (period == 0)
            return balance;
        else
            return 1.11* calculateProfit(balance, period-1);
    }
    public static void main(String[] args) {
        Scanner input12= new Scanner(System.in);
        
        System.out.print("Input Balance:");
        double initialBalance = input12.nextInt();
        System.out.print("Input Investment Period: ");
        int InvestPeriod = input12.nextInt();

        //call function calculateProfit()
        System.out.println("Balance after " + InvestPeriod + " year =" +
                            calculateProfit(initialBalance, InvestPeriod));
    }
    
}
