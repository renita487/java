import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid Units!");
            return;
        }

        double amount;

        if (units <= 100) {
            amount = units * 1.50;
        } else if (units <= 300) {
            amount = (100 * 1.50) + ((units - 100) * 2.50);
        } else {
            amount = (100 * 1.50) + (200 * 2.50) + ((units - 300) * 4.00);
        }

        System.out.println("\nConsumer Name : " + name);
        System.out.printf("Electricity Bill : ₹%.2f\n", amount);

        sc.close();
    }
}