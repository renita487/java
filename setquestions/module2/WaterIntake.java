import java.util.Scanner;

public class WaterIntake {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 7; i++) {

            System.out.print("Enter glasses of water for Day " + i + ": ");
            int glasses = sc.nextInt();

            if (glasses < 0) {
                System.out.println("Invalid Input!");
                return;
            }

            total = total + glasses;
        }

        double average = total / 7.0;

        System.out.println("\nTotal Glasses = " + total);
        System.out.printf("Average = %.2f\n", average);

        if (average >= 8) {
            System.out.println("Recommended Daily Intake Achieved.");
        } else {
            System.out.println("Recommended Daily Intake Not Achieved.");
        }

        sc.close();
    }
}