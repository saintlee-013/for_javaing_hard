//A university wants to store and manage the marks of students in a subject using Java Vector collection. Write a Java program that performs the following operations using a
//Vector<Integer>: Create a Vector to store integer marks. Add marks of 5 students to the Vector. 
//Display all the marks stored in the Vector. 
//Display total number of elements using size(), Capacity of the Vector using capacity(),
//Insert a new mark at a given index
//Remove a mark from a specified index
//Check whether a particular mark exists in the Vector,
//Display the first and last mark in the Vector.

import java.io.*;
import java.util.*;
class Marks
{
  public static void main(String args[]) throws IOException
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader    br  = new BufferedReader(isr);
    Vector<Integer> marks = new Vector<Integer>();
    System.out.println("Enter the marks of 5 students ");
    for(int i = 0; i<5; i++)
    {
     marks.add(Integer.parseInt(br.readLine()));
    }

    System.out.println("The marks for the 5 students are as follows:");
    for(int a : marks) System.out.print(a + " ");
    System.out.println();

    System.out.println("The size of the vector collection is: " + marks.size());
    System.out.println("The capacity of the vector collection is: " + marks.capacity());

    System.out.println("Enter the index where the new marks must be added:");
    int new_index = Integer.parseInt(br.readLine());
    System.out.println("Enter the marks:");
    int new_marks = Integer.parseInt(br.readLine());
    marks.add(new_index, new_marks);
    System.out.println("The new vector collection after addition becomes: ");
    for(int a : marks) System.out.print(a + " ");
    System.out.println();


    System.out.println("Enter the index where the marks must be removed:");
    int re_index = Integer.parseInt(br.readLine());
    marks.remove(re_index);
    System.out.println("The new vector collection after deletion becomes: ");
    for(int a : marks) System.out.print(a + " ");
    System.out.println();


   System.out.println("Enter the marks to be checked:");
   int check_marks = Integer.parseInt(br.readLine());
   if(marks.contains(check_marks)) System.out.println("It is present!");
   else System.out.println("It is not present!");
 
   System.out.println("The first and the last elements of the vector respectively are : " + marks.get(0) + "  " + marks.get(marks.size() - 1));
  }
}