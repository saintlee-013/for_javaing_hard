/*
WAP to create a super class having a variable. Let the variable be initialized to some value within a constructor. 
This class should have a method display () to display the initial value of the variable. 
Derive a sub class that accesses the constructor, variable and method of the super class using super keyword.
*/
class SUPER_CLASS
{
  public int a;
  SUPER_CLASS(){
  a = 13;
  }
  public void display(){
  System.out.println("The initial value of the variable is : " +  a + " in the superclass constructor");
  }
}
class SUB_CLASS extends SUPERCLASS
{
 public static void main(String args[])
 {
   SUB_CLASS obj = new SUB_CLASS();
   obj.SUPER_CLASS();
   System.out.println("This is from the main method of the subclass: the value of the variable is: " + super.a);
   super.display();
 }
}