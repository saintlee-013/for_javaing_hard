//a. WAP to accept students' names from the command line and store them in a vector.
import java.util.*;
class Students_names_Vector
{
 public static void main(String args[])
 {
  Vector<String> v = new Vector<String>();
  for(String a : args) System.out.println(a);
  for(String b : args) v.add(b);
  System.out.println(v);
 }
}
