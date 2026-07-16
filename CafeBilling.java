import java.util.Scanner;

public class CafeBilling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double item1, item2, item3;
        double total, gst, finalBill;

        System.out.print("Enter the price of Item 1: ");
        item1 = sc.nextDouble();

        System.out.print("Enter the price of Item 2: ");
        item2 = sc.nextDouble();

        System.out.print("Enter the price of Item 3: ");
        item3 = sc.nextDouble();

        total = item1 + item2 + item3;
        gst = total * 0.05;
        finalBill = total + gst;

        System.out.println("\n------ Cafe Bill ------");
        System.out.println("Total Amount : " + total);
        System.out.println("GST (5%)     : " + gst);
        System.out.println("Final Bill   : " + finalBill);

        sc.close();
    }
}