import java.util.Scanner;

public class FixedDeposit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        int principal = sc.nextInt();

        System.out.print("Enter Annual Interest Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Duration (Years): ");
        int years = sc.nextInt();

        if (principal <= 0 || rate <= 0 || years <= 0) {
            System.out.println("Invalid Input!");
            return;
        }

        double amount = (double) principal *
                Math.pow((1 + rate / 100), (double) years);

        double interest = amount - principal;

        System.out.printf("Maturity Amount : ₹%.2f\n", amount);
        System.out.printf("Interest Earned : ₹%.2f\n", interest);

        sc.close();
    }
}