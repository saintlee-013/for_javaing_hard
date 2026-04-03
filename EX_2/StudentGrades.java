import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int topStudentRoll = 0;
        int maxTotal = -1; 
        System.out.println("Enter details for 5 students:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Student " + i + " ");
            
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            
            System.out.print("Enter marks for Subject 1: ");
            int s1 = sc.nextInt();
            
            System.out.print("Enter marks for Subject 2: ");
            int s2 = sc.nextInt();
            
            System.out.print("Enter marks for Subject 3: ");
            int s3 = sc.nextInt();

            int currentTotal = s1 + s2 + s3;
            System.out.println("Total Marks for Roll " + roll + ": " + currentTotal);

                if (currentTotal > maxTotal) {
                maxTotal = currentTotal;
                topStudentRoll = roll;
            }
        }

        System.out.println("Highest Scorer Roll No: " + topStudentRoll);
        System.out.println("Highest Total Marks: " + maxTotal);
        
       }
}