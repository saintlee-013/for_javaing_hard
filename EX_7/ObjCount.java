
class ObjCount
{
 static int count = 0;
 ObjCount()
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
   ObjCount o5 = new ObjCount();
   ObjCount o6 = new ObjCount();
   System.out.println("The number of objects : " + getCount());
 }
}