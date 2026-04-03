
public class RightAlignedPattern {
    public static void main(String[] args) {
        int rows = 4;
        int totalCharsUsed = 0;

        for (int i = 1; i <= rows; i++) {
            for (int k = rows; k > i; k--) {
                System.out.print("  "); 
            }
            totalCharsUsed += i; 
            char ch = (char) ('A' + totalCharsUsed - 1);            
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
}