import java.util.*;
class Area_Prime
{
 int l, w, s, area;
 Area_Prime()
 {
   s = 5; area = s*s;
 }
Area_Prime(int leng, int wid)
 {
   l = leng; w = wid; 
   area = l*w;
 }
Area_Prime(int side)
 {
   s = side;
   area = s*s;
 }
Area_Prime(Area_Prime obj)
{
 l = obj.l; w = obj.w; area = obj.area;
}
public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the length of rectangle:");
  int l1 = sc.nextInt();
  System.out.println("Enter the width of rectangle:");
  int w1 = sc.nextInt();
  System.out.println("Enter the side of square:");
  int s1 = sc.nextInt();
  Area_Prime ap1 = new Area_Prime();
  Area_Prime ap2 = new Area_Prime(l1,w1);
  Area_Prime ap3 = new Area_Prime(s1);
  Area_Prime ap4 = new Area_Prime(ap2);
  System.out.println("By using the default constructor and defined values:");
  System.out.println("The area of the square with side = 5 is: " + ap1.area + " units");
  System.out.println("By using the parameterised constructor and user defined values:");
  System.out.println("The area of the rectangle is: " + ap2.area + " units");
  System.out.println("By using the parameterised constructor and user defined values:");
  System.out.println("The area of the square with side given by the user is: " + ap3.area + " units");
  System.out.println("By using the copy constructor, and the user's value:");
  System.out.println("The area of the rectangle is given by the user is : " + ap4.area + " units");

 }
}