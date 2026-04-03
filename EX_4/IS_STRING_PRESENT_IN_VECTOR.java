//WAP to add n strings in a vector array. Input new string and check if it is present in the
//vector. If present delete it else add to the vector

import java.util.*;
import java.io.*;
class IS_STRING_PRESENT_IN_VECTOR
{
 public static void main(String args[]) throws IOException
 {
  Vector<String> v = new Vector<String>();
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  System.out.println("Enter the number of string to be added: ");
  int n = (Integer.parseInt(br.readLine()));
  for(int i = 0; i<n; i++)
  {
   System.out.println("Enter the " + (i+1) + " th string: "); 
   v.add(br.readLine());
  }
  System.out.println("The vector is: " + v);
  System.out.println("Enter the string to check if it present in the vector:");
  String search_string = br.readLine();
  if(v.contains(search_string)) 
   {
    System.out.println("It is found"); 
    v.remove(search_string);
    System.out.println("After deletion, the vectro is: " + v);
   }
  else
  {
    System.out.println("The string is not found!");
    v.add(search_string);
    System.out.println("After additon of the string in the vector: " + v);
  }
 }
}