import java.util.Scanner;

public class ForeignExchange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount in INR: ");
        double inr = sc.nextDouble();

        System.out.print("Enter Exchange Rate (INR per USD): ");
        double rate = sc.nextDouble();

        if (inr <= 50 || rate <= 0) {
            System.out.println("Invalid Input!");
            return;
        }

        double processingFee = 50;
        double amountForConversion = inr - processingFee;

        double usd = amountForConversion / rate;
        double commission = usd * 0.02;
        double finalUSD = usd - commission;

        System.out.printf("Amount after Processing Fee : ₹%.2f\n", amountForConversion);
        System.out.printf("Converted USD : %.2f\n", usd);
        System.out.printf("Commission (2%%) : %.2f USD\n", commission);
        System.out.printf("Final USD : %.2f USD\n", finalUSD);

        sc.close();
    }
}