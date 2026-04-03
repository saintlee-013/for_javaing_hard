//Write a Java program that reads a positive integer from command line and count the number of digits the number (less than ten billion) has.
class No_of_digits
{
 public static void main(String args[])
 {
   int count = 0;
   int a = Integer.parseInt(args[0]);       
    while(a!=0)
     {
       a = a/10;
       count++;
     }
   System.out.println("The number of digits is " + count);
  }
}