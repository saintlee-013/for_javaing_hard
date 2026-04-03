import java.io.*;
import java.util.*;

public class Sum_Manipulation_Of_Array1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(); 
        
        String[] strNums = line.split(" ");
        int N = strNums.length;
        
        int[] A = new int[N];
        long totalSum = 0;
        
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(strNums[i]);
            totalSum += A[i]; 
        }

            for (int i = 0; i < N; i++) {
            System.out.print((totalSum - A[i]) + " ");
        }
    }
}