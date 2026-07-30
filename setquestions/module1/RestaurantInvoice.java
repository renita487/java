import java.util.Scanner;

public class RestaurantInvoice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Adult Meals: ");
        int adults = sc.nextInt();

        System.out.print("Enter Number of Children's Meals: ");
        int children = sc.nextInt();

        if (adults < 0 || children < 0) {
            System.out.println("Invalid Input!");
            return;
        }

        double foodCost = adults * 280 + children * 160;
        double serviceCharge = foodCost * 0.08;
        double amount = foodCost + serviceCharge;
        double gst = amount * 0.05;
        double total = amount + gst;

        double coupon = 0;

        if (total > 3000) {
            coupon = 250;
        }

        double finalAmount = total - coupon;

        System.out.println("\nCustomer Name : " + name);
        System.out.printf("Food Cost : ₹%.2f\n", foodCost);
        System.out.printf("Service Charge : ₹%.2f\n", serviceCharge);
        System.out.printf("GST : ₹%.2f\n", gst);
        System.out.printf("Coupon Discount : ₹%.2f\n", coupon);
        System.out.printf("Final Amount Payable : ₹%.2f\n", finalAmount);

        sc.close();
    }
}