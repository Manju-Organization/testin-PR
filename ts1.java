import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();

        // Print the multiplication table for the given number
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        // Close the scanner object
        scanner.close();
    }
}
gfbnsxc 
    fg
