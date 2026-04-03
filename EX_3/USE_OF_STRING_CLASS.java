//b. Write a Java program to accept a string and perform the following operations using the String
//class: Find the length of the string, Convert the string to uppercase, concatenate another
//string to it, Display the original string to show that it is unchanged.

import java.util.*;
import java.io.*;
//String class is in lang package that is imported by default.
class USE_OF_STRING_CLASS
{
 public static void main(String args[]) throws IOException
 {
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   System.out.println("Enter a string:");
   String s = br.readLine();
   int len = s.length();
   System.out.println("The length of the string is:  "+ len);
   String uc = s.toUpperCase();
   System.out.println("Enter another string for concatenation: ");
   String s1 = br.readLine();
   String c = uc.concat(s1);
   String c1 = s.concat(s1);
   System.out.println("After converting it to uppercase and concatenation: " + c);
   System.out.println("After concatenation with the original: " + c1);
   System.out.println("The original string: " + s);
 }
}