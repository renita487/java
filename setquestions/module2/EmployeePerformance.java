import java.util.Scanner;

public class EmployeePerformance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int excellent = 0;
        int veryGood = 0;
        int good = 0;
        int improvement = 0;

        char choice;

        do {

            System.out.print("Enter Employee Sales: ₹");
            double sales = sc.nextDouble();

            if (sales < 0) {
                System.out.println("Invalid Sales Amount!");
            } else if (sales >= 100000) {
                System.out.println("Performance: Excellent");
                excellent++;
            } else if (sales >= 75000) {
                System.out.println("Performance: Very Good");
                veryGood++;
            } else if (sales >= 50000) {
                System.out.println("Performance: Good");
                good++;
            } else {
                System.out.println("Performance: Needs Improvement");
                improvement++;
            }

            System.out.print("Process another employee? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nSummary");
        System.out.println("Excellent : " + excellent);
        System.out.println("Very Good : " + veryGood);
        System.out.println("Good : " + good);
        System.out.println("Needs Improvement : " + improvement);

        sc.close();
    }
}