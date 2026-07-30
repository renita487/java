import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int total = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter Mark " + i + ": ");
            int mark = sc.nextInt();

            if (mark < 0 || mark > 100) {
                System.out.println("Invalid Mark!");
                return;
            }

            total = total + mark;
        }

        double average = total / 5.0;

        System.out.println("\nStudent Name : " + name);
        System.out.println("Total Marks : " + total);
        System.out.printf("Average : %.2f\n", average);

        if (average >= 90) {
            System.out.println("Grade : O");
        } else if (average >= 80) {
            System.out.println("Grade : A+");
        } else if (average >= 70) {
            System.out.println("Grade : A");
        } else if (average >= 60) {
            System.out.println("Grade : B");
        } else if (average >= 50) {
            System.out.println("Grade : C");
        } else {
            System.out.println("Result : Fail");
        }

        sc.close();
    }
}