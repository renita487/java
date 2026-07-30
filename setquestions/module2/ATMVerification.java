import java.util.Scanner;

public class ATMVerification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                System.out.println("Access Granted.");
                sc.close();
                return;
            } else {
                attempts--;

                if (attempts > 0) {
                    System.out.println("Incorrect PIN. Remaining Attempts: " + attempts);
                } else {
                    System.out.println("Card Blocked!");
                }
            }
        }

        sc.close();
    }
}