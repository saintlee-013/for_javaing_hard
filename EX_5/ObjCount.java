//WAP to count the number of objects made of a particular class using static variable and static methods and display the same.
class ObjCount
{
 static int count = 0;
 {
   count++;
 }
 static int getCount()
 {
  return count;
 }
public static void main(String args[])
 {
   ObjCount o1 = new ObjCount();
   ObjCount o2 = new ObjCount();
   ObjCount o3 = new ObjCount();
   ObjCount o4 = new ObjCount();
   System.out.println("The number of objects : " + getCount());
 }
}