import java.util.Scanner;
public class StudentMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[5][4];
        int maxTotal = -1;
        int topStudentRoll = 0;

        for (int i = 0; i < 5; i++) {
            int currentTotal = 0;
            System.out.println("Entering data for Student " + (i + 1) + ":");

            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    System.out.print("Enter Roll No: ");
                    data[i][j] = sc.nextInt();
                } else {
                    System.out.print("Enter marks for Subject " + j + ": ");
                    data[i][j] = sc.nextInt();
                    currentTotal += data[i][j];
                }
            }

            System.out.println("Total Marks for this student: " + currentTotal);

            if (currentTotal > maxTotal) {
                maxTotal = currentTotal;
                topStudentRoll = data[i][0]; 
            }
        }

        System.out.println("Topper Roll No: " + topStudentRoll);
        System.out.println("Highest Marks: " + maxTotal);
       }
}