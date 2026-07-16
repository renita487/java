import java.util.Scanner;

public class pb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter INR Amount: ");
        double inr = sc.nextDouble();

        System.out.print("Enter Exchange Rate (INR per 1 USD): ");
        double rate = sc.nextDouble();

        double processingFee = 50.0;
        double amountForConversion = inr - processingFee;

        double convertedUSD = amountForConversion / rate;
        double commission = convertedUSD * 0.02;
        double finalUSD = convertedUSD - commission;

        System.out.printf("Amount after Processing Fee: %.2f INR\n", amountForConversion);
        System.out.printf("Converted Amount: %.2f USD\n", convertedUSD);
        System.out.printf("Commission: %.2f USD\n", commission);
        System.out.printf("Final USD Handed to Customer: %.2f USD\n", finalUSD);

        sc.close();
    }
}