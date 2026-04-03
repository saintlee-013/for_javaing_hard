import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        double n1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = input.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = input.nextDouble();

        double largest;

        // Nested if-else logic
        if (n1 >= n2) {
            if (n1 >= n3) {
                largest = n1;
            } else {
                largest = n3;
            }
        } else {
            if (n2 >= n3) {
                largest = n2;
            } else {
                largest = n3;
            }
        }

        System.out.println("\nThe largest number is: " + largest);
        
        input.close();
    }
}