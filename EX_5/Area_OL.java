//WAP to display the area of square and rectangle using the concept of overloaded functions.
import java.util.*;
class Area_OL
{
 public void area(int s)
 {
   int ar = s*s;
   System.out.println("The area of the square is : " + ar);
 }
 public void area(int l, int w)
 {
   int ar = l*w;
   System.out.println("The area of the rectangle is : " + ar);
 }

 public static void main(String args[])
 {
   Area_OL obj = new Area_OL();
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the side of the square:");
   int side = sc.nextInt();
   System.out.println("Enter the length of the rectangle:");
   int leng = sc.nextInt();
   System.out.println("Enter the width of the rectangle:");
   int wid = sc.nextInt();
   obj.area(side); obj.area(leng, wid);
 }
}