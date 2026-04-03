//d. Write a menu driven program using switch case to perform mathematical operations.
import java.util.*;
class Menu
{
 public static void main(String args[])
 {
  int cont = 1; 
  Scanner sc = new Scanner(System.in);
while(cont == 1){
System.out.println("Enter two numbers"); int a = sc.nextInt(); int b = sc.nextInt();
System.out.println("Enter 1 for ADDITION, 2 for SUBTRACTION, 3 for DIVISION, 4 for MULTIPLICATION, 5 for MODULO/REMAINDER");
  int c = sc.nextInt();
switch (c) {
  case 1:
    System.out.println(a + " + " + b +  " = "  + (a+b));
    break;
  case 2:
    System.out.println(a + " - " + b  + " = "+ (a-b) );
    break;
  case 3:
    if(b!=0) System.out.println(a + " / " + b  + " = "+ (double)(a/b));
    else System.out.println("Can not divide by zero.");
    break;
  case 4:
    System.out.println(a + " * " + b +  " = "+ (a*b));
    break;
 case 5:
    System.out.println(a + " % " + b +  " = "+ (a%b));
    break;
  default:
    System.out.println("Not valid.");
    break;
 }
System.out.println("enter 1 to continue and any other number than 1 to exit.");
cont = sc.nextInt();
 }
 }
}