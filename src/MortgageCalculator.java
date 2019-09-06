/*
This code is poorly commented. Actually, it has no comments at all. To make matters worse, the variables are not
appropriately named. Can you figure out what this program actually does? Would you like to be the person who is
 assigned the task of maintaining code like this?

import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double l = 0;
        double i = 0;
        double mp = 0;
        double bal = 0;
        int trm;

        System.out.printf("Enter the loan amount: ");
        l = keyboard.nextDouble();

        System.out.printf("Enter the interest rate on the loan: ");
        i = keyboard.nextDouble();

        System.out.printf("Enter the term (years) for the loan payment: ");
        trm = keyboard.nextInt();

        System.out.printf("\n======================================\n");
        keyboard.close();

        mp = processSomething(l, i, trm);
        bal = -(mp*(trm*12));
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", bal);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", mp);
    }


    public static double processSomething(double l, double i, int trm) {
        // calculates the monthly payment
        double rate = (i/ 100) / 12;
        double base = (1 + rate);
        double months = trm* 12;
        double result = 0.0;
        result = ((rate * l) / (1 - Math.pow(base, -months)));

        return result;
    }
}
Your assignment
Clean up the following code by adding comments where appropriate. If you read the program carefully you should be able
 to follow it. Also, rename variables and methods to be meaningful and consistent.
 */

/*
This progrm calculates the balance owed to the bank and the monthly payment once user provides 'Loan amount',
'Interest rate' and 'Term (years)'.
 */
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String [] args){

    Scanner keyboard = new Scanner(System.in);

    double loanAmount = 0;
    double intRate = 0;
    double monthlyPayment = 0;
    double balance = 0;
    int term;

        // prompt user to enter Loan Amount
        System.out.println("Enter the loan amount: ");
        loanAmount = keyboard.nextDouble();

        // prompt user to enter Interest Rate
        System.out.println("Enter the interest rate on the loan: ");
        intRate = keyboard.nextDouble();

        // prompt user to enter term for loan payment
        System.out.println("Enter the term (years) for the loan payment: ");
        term = keyboard.nextInt();

        System.out.println("\n======================================\n");
        keyboard.close();

        // calculates monthly payment
        monthlyPayment = processSomething(loanAmount, intRate, term);

        // calculates balance owed to bank
        balance = -(monthlyPayment*(term*12));
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", monthlyPayment);
}

    // method to calculate monthly payment
    public static double processSomething(double l, double i, int trm) {
        // calculates the monthly payment
        double rate = (i/ 100) / 12;
        double base = (1 + rate);
        double months = trm* 12;
        double result = 0.0;
        result = ((rate * l) / (1 - Math.pow(base, -months)));

        return result;
    }
}
