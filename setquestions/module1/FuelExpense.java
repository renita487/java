import java.util.Scanner;

public class FuelExpense {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter Mileage (km/litre): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter Petrol Cost per litre: ");
        double price = sc.nextDouble();

        if (distance < 0 || mileage <= 0 || price < 0) {
            System.out.println("Invalid Input!");
            return;
        }

        double fuel = distance / mileage;
        double cost = fuel * price;

        System.out.printf("Fuel Required : %.2f litres\n", fuel);
        System.out.printf("Fuel Expense : ₹%.2f\n", cost);

        sc.close();
    }
}