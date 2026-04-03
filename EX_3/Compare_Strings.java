//. Write a Java program to compare two strings that have the same content but are created in
//different ways—one using a string literal and the other using the new keyword. Compare the
//strings using: equals() method to check content equality == operator to check reference
//Equality

import java.util.*;
class Compare_Strings
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first string: ");
    String sl = sc.next();
    System.out.println("Enter the second string: ");
    String so = new String(sc.next());
    boolean is_eq = sl.equals(so);
    System.out.println("Using equals() method: " + is_eq);
    boolean is_eq_1 = (sl==so);
    System.out.println("Using == : " + is_eq_1);
  }
}
