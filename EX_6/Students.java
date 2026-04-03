/*** 
WOOP to arrange the names of students in descending order of their total marks, input data consists of students' details such as names, ID.no, marks of maths, physics, chemistry. 
(Use array of objects)
***/
import java.io.*;
class Students
{
 String name; int total = 0, id, maths, phy, chem;
 void get_student_data() throws IOException
 {
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br     = new BufferedReader(isr);
  System.out.print("Enter the name of the student :\t");
  name = br.readLine();
  System.out.print("Enter the id of the student :\t");
  id = Integer.parseInt(br.readLine());
  System.out.print("Enter the MATHS MARKS of the student :\t");
  maths = Integer.parseInt(br.readLine());
  System.out.print("Enter the PHYSICS MARKS of the student :\t");
  phy = Integer.parseInt(br.readLine());
  System.out.print("Enter the CHEMISTRY MARKS of the student :\t");
  chem = Integer.parseInt(br.readLine());
  total = maths + phy + chem;
 }
 void sort_data(Students s_a[])
 {
  Students temp = new Students();
  for(int i = 0; i<s_a.length; i++)
  {
   for(int j = 0; j<s_a.length-i-1; j++)
   {
     if(s_a[j].total < s_a[j+1].total)
     {
       temp      = s_a[j];
       s_a[j]    =  s_a[j+1];
       s_a[j+1]  = temp;
     }
   }
  }
  System.out.println("NAME" + "\t\t" + "ID" + "\t\t" + "MATHS" + "\t\t" + "PHYSICS" + "\t\t" + "CHEMISTRY" + "\t\t" + "TOTAL");
  for(int i = 0; i<s_a.length; i++) 
  {
    System.out.println(s_a[i].name + "\t\t" + s_a[i].id + "\t\t" + s_a[i].maths + "\t\t" + s_a[i].phy + "\t\t" + s_a[i].chem + "\t\t" + s_a[i].total );
  }

 }
 public static void main(String args[]) throws IOException
 {
  Students obj = new Students();
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br     = new BufferedReader(isr);
  System.out.print("Enter the number of students : ");
  int n = Integer.parseInt(br.readLine());
  Students s_a[] = new Students[n];
  for(int i = 0; i<n; i++) 
  {
    s_a[i] = new Students(); s_a[i].get_student_data();
  }
  obj.sort_data(s_a);
 }
}
