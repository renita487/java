import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length (m): ");
        double length = sc.nextDouble();

        System.out.print("Enter Breadth (m): ");
        double breadth = sc.nextDouble();

        System.out.print("Enter Height (m): ");
        double height = sc.nextDouble();

        double volume = length * breadth * height;
        double capacity = volume * 1000;

        System.out.printf("Volume of Tank: %.2f cubic metres\n", volume);
        System.out.printf("Capacity: %.2f litres\n", capacity);

        sc.close();
    }
}