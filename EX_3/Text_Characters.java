//a. WAP to find out number of uppercase & lowercase characters, blank spaces and digits from
//the string.

import java.io.*;
import java.util.*;
class Text_Characters
{
 public static void main(String args[]) throws IOException
 {
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  ArrayList<Character> UC = new ArrayList<Character>();
  ArrayList<Character> LC = new ArrayList<Character>();
  ArrayList<Character> D  = new ArrayList<Character>();
  ArrayList<Character> SC = new ArrayList<Character>();

  String s; char ch; int uc = 0, lc = 0, bs = 0, d = 0, sc = 0;
  //here sc is for special character.
  System.out.println("Enter a line of text: ");
  s = br.readLine();
  for(int i = 0; i<s.length(); i++)
  {
    ch = s.charAt(i);
    if(Character.isUpperCase(ch)){ uc++; UC.add(ch);}
    else if(Character.isLowerCase(ch)){ lc++; LC.add(ch);}
    else if(ch == ' ') bs++; 
    else if(Character.isDigit(ch)){ d++; D.add(ch);}
    else {sc++; SC.add(ch);}
  }
  System.out.println("The number of upper case letter is:  " + uc + " and they are: " + UC);
  System.out.println("The number of lower case letter is:  " + lc + " and they are:  " + LC);
  System.out.println("The number of blank spaces:  " + bs);
  System.out.println("The number of digits is:  " + d + " and they are: " + D);
  System.out.println("The number of special characters is:  " + sc + " and they are:  " + SC);
 }
}