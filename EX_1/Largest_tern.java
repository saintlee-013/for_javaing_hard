import java.util.*;
public class Largest_tern
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        int larg;
        larg = (a>b)?((a>c)?a:c):b; // ()?:
        System.out.println(larg + " is the largest");
    }
}