import java.util.Scanner;

public class pb1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.15;
        double gross = basic + hra + da;

        double professionalTax = 250;
        double totalDeduction = professionalTax;
        double netSalary = gross - totalDeduction;

        System.out.println("\nEmployee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.printf("Basic Salary: %.2f\n", basic);
        System.out.printf("HRA: %.2f\n", hra);
        System.out.printf("DA: %.2f\n", da);
        System.out.printf("Gross Salary: %.2f\n", gross);
        System.out.printf("Total Deduction: %.2f\n", totalDeduction);
        System.out.printf("Net Salary: %.2f\n", netSalary);

        sc.close();
    }
}