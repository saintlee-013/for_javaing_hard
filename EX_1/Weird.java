 import java.util.*;
public class Weird
{
   public static void main(String args[])
   {
       int cont = 1;
       Scanner sc = new Scanner(System.in);
       while(cont == 1){
       System.out.println("Enter the number: ");
       int n = sc.nextInt();
       if(n%2!=0) System.out.println("Weird");
       else if(n%2==0 && (n>=2 && n<=5)) System.out.println("Not Weird");
       else if(n%2==0 && (n>=6 && n<=20)) System.out.println("Weird");
       else if(n%2==0 && n>20)System.out.println("Not Weird");
       System.out.println("Enter 1 to continue and any other number to exit. ");
       cont = sc.nextInt();
       }
   }
}
