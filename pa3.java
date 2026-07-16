import java.util.Scanner;

public class pa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance, mileage, petrolCost;
        double fuelRequired, totalCost;

        System.out.print("Enter distance (km): ");
        distance = sc.nextDouble();

        System.out.print("Enter mileage (km/litre): ");
        mileage = sc.nextDouble();

        System.out.print("Enter petrol cost per litre: ");
        petrolCost = sc.nextDouble();

        fuelRequired = distance / mileage;
        totalCost = fuelRequired * petrolCost;

        System.out.printf("Fuel Required = %.2f litres%n", fuelRequired);
        System.out.printf("Total Fuel Cost = %.2f", totalCost);

        sc.close();
    }
}