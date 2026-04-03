/*
Class A is the superclass for Class B
Class B is the superclass for Class C
So, this is multilevel inheritance!
when we create an instance of a child class, the constructors are called in order from the top of the hierarchy down to the bottom
(Base -> Intermediate -> Derived).
*/
class A
{
  A(){
      System.out.println("THIS IS THE CONSTRUCTOR FROM CLASS A!");see();
     }
  void speak(){   System.out.println("THIS IS FROM THE CLASS A!");   }
  protected void read(){   System.out.println("THIS IS FROM THE CLASS A! BUT READING!");   }
  private void see(){   System.out.println("THIS IS FROM THE CLASS A! BUT SEEING!");   }
  
  /*A obj_og = new A();
    { obj_og.see(); }
   StackOverflow
  */
}

class B extends A
{
  B(){
      super.speak();
      System.out.println("THIS IS THE CONSTRUCTOR FROM CLASS B!");
     }
  @Override
  void speak(){   System.out.println("THIS IS FROM THE CLASS B!");   }
}
class C extends B
{
  C(){
      super();
      System.out.println("THIS IS THE CONSTRUCTOR FROM CLASS C!");
     }

  void talk(){   System.out.println("THIS IS FROM THE CLASS C!");   }
}
class EXP_8_A
{
 public static void main(String args[])
 {
   A obj = new C();
   obj.speak();
   /*obj.read();
 EXP_8_A.java:40: error: read() has private access in A
   obj.read();
      ^
    */

   /* obj.talk();
 error: cannot find symbol
   obj.talk();
      ^
  symbol:   method talk()
  location: variable obj of type A */
  C obj1 = new C();
  obj1.talk();

   A obj2 = new A();
   obj2.read(); //obj2.see();
   
 }
}