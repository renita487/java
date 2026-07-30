import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int primeCount = 0;
        int evenCount = 0;

        while (true) {

            System.out.print("Enter a Number (-1 to Stop): ");
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            total++;

            if (num % 2 == 0) {
                System.out.println("Even");
                evenCount++;
            } else {
                System.out.println("Odd");
            }

            if (num >= 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }

            boolean prime = true;

            if (num <= 1) {
                prime = false;
            } else {

                for (int i = 2; i <= Math.sqrt(num); i++) {

                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.println("Prime");
                primeCount++;
            } else {
                System.out.println("Composite / Not Prime");
            }

            System.out.println();
        }

        System.out.println("Total Numbers = " + total);
        System.out.println("Prime Numbers = " + primeCount);
        System.out.println("Even Numbers = " + evenCount);

        sc.close();
    }
}