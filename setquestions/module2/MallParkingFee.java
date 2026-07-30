import java.util.Scanner;

public class MallParkingFee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vehicle Types");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Bus");

        System.out.print("Enter Vehicle Type (1-3): ");
        int choice = sc.nextInt();

        System.out.print("Enter Parking Duration (Hours): ");
        int hours = sc.nextInt();

        if (hours <= 0) {
            System.out.println("Invalid Duration!");
            return;
        }

        double fee = 0;

        switch (choice) {

            case 1:
                fee = hours * 20;
                break;

            case 2:
                fee = hours * 50;
                break;

            case 3:
                fee = hours * 80;
                break;

            default:
                System.out.println("Invalid Vehicle Type!");
                return;
        }

        if (hours > 8) {
            fee = fee - (fee * 0.10);
        }

        System.out.printf("Parking Fee = ₹%.2f\n", fee);

        sc.close();
    }
}