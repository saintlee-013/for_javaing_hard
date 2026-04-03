import java.io.IOException;
public class Sum_Manipulation_Of_Array2 {
    public static void main(String[] args) throws IOException {
        int[] A = new int[100]; 
        int N = 0;
        int currentNum = 0;
        long totalSum = 0;
        boolean buildingNumber = false;

        System.out.println("Enter numbers separated by spaces (Press Enter when done):");

        while (true) {
            int c = System.in.read();
            if (c >= '0' && c <= '9') {
                currentNum = (currentNum * 10) + (c - '0');
                buildingNumber = true;
            } 
            else if (c == ' ' || c == '\n' || c == '\r' || c == -1) {
                if (buildingNumber) {
                    A[N] = currentNum;
                    totalSum += A[N];
                    N++;
                    currentNum = 0;
                    buildingNumber = false;
                }
                if (c == '\n' || c == '\r' || c == -1) break;
            }
        }

            for (int i = 0; i < N; i++) {
            System.out.print((totalSum - A[i]) + " ");
        }
    }
}