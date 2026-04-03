/*Create a class employee with data member’s empid, empname, designation and salary. 
Write methods getemployee() to take user input, showgrade() to display grade of employee based on salary, showemployee() to display details of employees.
*/
import java.util.*;
class Employee
{
 int empid; String empname; String designation; int salary;
 public void getemployee()
 {
   Employee obj = new Employee();
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Employee ID:");
   obj.empid = sc.nextInt();
   sc.nextLine();
   System.out.println("Enter the Employee Name:");
   obj.empname = sc.nextLine();
   System.out.println("Enter the Employee Designation:");
   obj.designation = sc.nextLine();
   System.out.println("Enter the Employee Salary:");
   obj.salary = sc.nextInt();
   showemployee(obj.empid, obj.empname, obj.designation, obj.salary);
   showgrade(obj.salary);
 }
 public void showgrade(int sal)
 {
  if(sal>1000000) System.out.println("Salary grade : A");
  else if(sal>100000) System.out.println("Salary grade : B");
  else if(sal>10000) System.out.println("Salary grade : C");
  else if(sal>1000) System.out.println("Salary grade : D");
 }
public void showemployee(int ed, String en, String d, int s)
{
 System.out.println("The id of the employee is : " + ed);
 System.out.println("The name of the employee is : " + en);
 System.out.println("The designation of the employee is : " + d);
 System.out.println("The salary of the employee is : " + s);
}
 public static void main(String args[])
 {
  Employee obj1 = new Employee();
  obj1.getemployee();

 }
}