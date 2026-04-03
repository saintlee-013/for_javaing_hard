//c. WAP to find value of y using recursive function (static), where y=x^n
import java.util.*;
class recursive_expo
{
 public static void main(String args[])
 {
   int con = 1;
   Scanner sc = new Scanner(System.in);
   while(con == 1){
   System.out.println("Enter the base");
   int b = sc.nextInt();
   System.out.println("Enter the power");
   int p = sc.nextInt();
   int ans = power(b,p);
   System.out.println("The answer for " + b + "^" + p + " is : " + ans);
   System.out.println("Enter 1 to continue or any other number to discontinue!");
   con = sc.nextInt();
   }
 }
 public static int power(int b, int p)
 {
  if(p == 0) return 1;
  else return b*(power(b,p-1));
 }
}