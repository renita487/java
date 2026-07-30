import java.util.Scanner;

public class MultiplexTicket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid Age!");
            return;
        }

        int price;

        if (age < 12) {
            price = 120;
        } else if (age < 60) {
            price = 200;
        } else {
            price = 150;
        }

        System.out.println("\nCustomer Name : " + name);
        System.out.println("Ticket Price : ₹" + price);

        sc.close();
    }
}