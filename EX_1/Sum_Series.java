import java.util.Scanner;

public class Sum_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        double sum = 0.0;

        // Loop from 1 to n to calculate the sum
        for (int i = 1; i <= n; i++) {
            // Formula for each term: 1 / (i * i)
            sum += 1.0 / (i * i);
        }

        System.out.println("The sum of the series up to " + n + " terms is: " + sum);
        
           }
}