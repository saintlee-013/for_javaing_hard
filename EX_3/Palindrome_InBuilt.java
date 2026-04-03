//c. WAP to check if a string is a palindrome or not using inbuild functions.
import java.util.*;
class Palindrome_InBuilt
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string!:");
    String s   = sc.next(); 
    StringBuffer str = new StringBuffer(s);
    String rev = str.reverse().toString();
    if(rev.equalsIgnoreCase(s)) System.out.println("It is a palindrome!");
    else System.out.println("It is not a palindrome!");

  }
}