import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password = "java123";
        String input;

        do {

            System.out.print("Enter Password: ");
            input = sc.nextLine();

            if (!input.equals(password)) {
                System.out.println("Incorrect Password!");
            }

        } while (!input.equals(password));

        System.out.println("Login Successful.");

        sc.close();
    }
}