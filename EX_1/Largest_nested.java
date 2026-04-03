/**
 WAP to find largest of 3 numbers using nested if else and nested ternary operator.
 */
import java.util.*;
public class Largest_nested
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        if(a>b && a>c) System.out.println(a + " is the largest.");
        else if(b>a && b>c) System.out.println(b + " is the largest");
        else System.out.println(c + " is the largest.");
    }
}
