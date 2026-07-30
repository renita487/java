import java.util.Scanner;

public class EmployeeAttendance {

    static void display(int[] att) {
        for (int a : att)
            System.out.print(a + " ");
        System.out.println();
    }

    static int countPresent(int[] att) {
        int count = 0;
        for (int a : att)
            count += a;
        return count;
    }

    static double attendancePercentage(int[] att) {
        return (countPresent(att) * 100.0) / att.length;
    }

    static boolean isEligible(double percentage) {
        return percentage >= 75;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] attendance = new int[n];

        for (int i = 0; i < n; i++) {
            attendance[i] = sc.nextInt();
        }

        display(attendance);

        int present = countPresent(attendance);
        double percent = attendancePercentage(attendance);

        System.out.println("Days Present = " + present);
        System.out.println("Attendance % = " + percent);
        System.out.println("Eligible = " + isEligible(percent));
    }
}