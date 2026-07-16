import java.util.Scanner;

public class prblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDays, attendedDays;
        double percentage;

        System.out.print("Enter total working days: ");
        totalDays = sc.nextInt();

        System.out.print("Enter days attended: ");
        attendedDays = sc.nextInt();

        percentage = ((double) attendedDays / totalDays) * 100;

        System.out.printf("Attendance Percentage = %.2f%%", percentage);

        sc.close();
    }
}