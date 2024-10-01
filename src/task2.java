import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        //Get the information we need

        System.out.println("Enter the total leased money");
        Scanner scanner = new Scanner(System.in);
        double totalLeased = scanner.nextDouble();

        System.out.println("Enter the down payment");
        double downPayment = scanner.nextDouble();

        System.out.println("Enter the lease term in months");
        int leaseTerm = scanner.nextInt();

        System.out.println("Enter the interest rate");
        double interestRate = scanner.nextDouble();

        //Equation for the monthly payment
        double monthlyPayment = ((totalLeased - downPayment) + ((totalLeased - downPayment) * (interestRate / 100))) / leaseTerm;

        //Print out the monthly payment
        System.out.println(monthlyPayment);

    }
}
