import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String correctPassword = "naz123";
        String input = "";


        while (input.equals(correctPassword) == false) {
            System.out.println("Enter password:");
            input = scanner.nextLine();

            if (input.equals(correctPassword) == false) {
                System.out.println("Wrong password. Try again.");
            }
        }

        System.out.println("Correct! Welcome.");
    }
}