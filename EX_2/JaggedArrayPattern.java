import java.util.Scanner;

public class JaggedArrayPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        int[][] jaggedArray = new int[rows][];

        for (int i = 0; i < rows; i++) {
            jaggedArray[i] = new int[i + 1];
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = j + 1;
            }
        }

        

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        
     }
}