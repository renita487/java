import java.util.Scanner;

public class HospitalBilling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consultation Fee: ");
        double consultation = sc.nextDouble();

        System.out.print("Enter Laboratory Charges: ");
        double lab = sc.nextDouble();

        System.out.print("Enter Pharmacy Charges: ");
        double pharmacy = sc.nextDouble();

        System.out.print("Enter Room Charges: ");
        double room = sc.nextDouble();

        if (consultation < 0 || lab < 0 || pharmacy < 0 || room < 0) {
            System.out.println("Invalid Input! Charges cannot be negative.");
            return;
        }

        double subtotal = consultation + lab + pharmacy + room;
        double serviceTax = subtotal * 0.08;
        double billWithTax = subtotal + serviceTax;
        double insurance = billWithTax * 0.25;
        double finalAmount = billWithTax - insurance;

        System.out.printf("\nSubtotal : ₹%.2f\n", subtotal);
        System.out.printf("Service Tax (8%%) : ₹%.2f\n", serviceTax);
        System.out.printf("Insurance (25%%) : ₹%.2f\n", insurance);
        System.out.printf("Final Amount Payable : ₹%.2f\n", finalAmount);

        sc.close();
    }
}