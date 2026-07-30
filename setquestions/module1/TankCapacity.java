import java.util.Scanner;

public class TankCapacity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length (m): ");
        double length = sc.nextDouble();

        System.out.print("Enter Breadth (m): ");
        double breadth = sc.nextDouble();

        System.out.print("Enter Height (m): ");
        double height = sc.nextDouble();

        if (length <= 0 || breadth <= 0 || height <= 0) {
            System.out.println("Invalid Dimensions!");
            return;
        }

        double volume = length * breadth * height;
        double litres = (double) volume * 1000;

        System.out.printf("Volume : %.2f cubic metres\n", volume);
        System.out.printf("Capacity : %.2f litres\n", litres);

        sc.close();
    }
}