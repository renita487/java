import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        if (basic < 0) {
            System.out.println("Invalid Salary!");
            return;
        }

        double hra = basic * 0.20;
        double da = basic * 0.15;
        double gross = basic + hra + da;
        double tax = 250;
        double net = gross - tax;

        System.out.println("\nEmployee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.printf("Basic Salary : ₹%.2f\n", basic);
        System.out.printf("HRA : ₹%.2f\n", hra);
        System.out.printf("DA : ₹%.2f\n", da);
        System.out.printf("Gross Salary : ₹%.2f\n", gross);
        System.out.printf("Professional Tax : ₹%.2f\n", tax);
        System.out.printf("Net Salary : ₹%.2f\n", net);

        sc.close();
    }
}