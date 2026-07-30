import java.util.Scanner;

public class CafeBilling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of Item 1: ");
        double item1 = sc.nextDouble();

        System.out.print("Enter price of Item 2: ");
        double item2 = sc.nextDouble();

        System.out.print("Enter price of Item 3: ");
        double item3 = sc.nextDouble();

        if (item1 < 0 || item2 < 0 || item3 < 0) {
            System.out.println("Invalid Input! Price cannot be negative.");
            return;
        }

        double subtotal = item1 + item2 + item3;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;

        System.out.printf("\nSubtotal : %.2f\n", subtotal);
        System.out.printf("GST (5%%): %.2f\n", gst);
        System.out.printf("Final Bill: %.2f\n", total);

        sc.close();
    }
}