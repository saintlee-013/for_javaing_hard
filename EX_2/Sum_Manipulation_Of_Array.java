import java.util.*;
class Sum_Manipulation_Of_Array
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int N; int sum = 0;
  System.out.println("Enter the number of elements: ");
  N = sc.nextInt();
  int a[] = new int[N];
  int b[] = new int[N];
  for(int i = 0; i<N; i++)
  {
   System.out.println("Enter the element at " + (i+1) + " position");
   a[i] = sc.nextInt();
   sum = sum + a[i];
  }
  for(int i = 0; i<N; i++)
  {
   b[i] = sum - a[i];
   System.out.print(b[i] + " ");
  }
 }
}