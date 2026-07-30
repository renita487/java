import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Working Days: ");
        int totalDays = sc.nextInt();

        System.out.print("Enter Days Attended: ");
        int attended = sc.nextInt();

        if (totalDays <= 0) {
            System.out.println("Total working days must be greater than zero.");
            return;
        }

        if (attended < 0 || attended > totalDays) {
            System.out.println("Invalid attendance entered.");
            return;
        }

        double percentage = ((double) attended / totalDays) * 100;

        System.out.printf("Attendance Percentage = %.2f%%\n", percentage);

        sc.close();
    }
}