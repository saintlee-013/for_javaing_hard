//Write a Java program to demonstrate the difference between String and StringBuffer by:
//Modifying a String using concat() Modifying a StringBuffer using append() Displaying the results
import java.util.*;
class Difference
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string!:");
    String s = sc.next();
    StringBuffer sb = new StringBuffer(s);
    String c = " World";
    System.out.println("After concatenation using concat(): " + s.concat(c));
    System.out.println("After concatenation using append(): " + sb.append(c));
    System.out.println("The original String class' String: " + s);
    System.out.println("The original StringBuffer class' String object: " + sb);
  }
}