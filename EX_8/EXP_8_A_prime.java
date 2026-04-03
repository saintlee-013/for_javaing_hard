/**
 * MULTILEVEL INHERITANCE
 * HIERARCHY: A->B->C 
 */

class A {
    // 1. THE CONSTRUCTOR CHAIN (STATE INITIALIZATION)
    A() {
        System.out.println("Constructor for Class A.");
        // Calling a private method internally is valid.
        // Instance Initializer Block separately will cause StackOverflow
        see(); 
    }

    void speak() { 
        System.out.println("A.speak() called."); 
    }

    protected void read() { 
        System.out.println("A.read() [Protected Access]."); 
    }

    private void see() { 
        System.out.println("A.see() [Private Access - Invisible to B/C]."); 
    }

    /* * --- THE RECURSION TRAP (MEMORY ANALYSIS) ---
     * Code: A obj_og = new A(); { obj_og.see(); }
     *
     * ANALYSIS:
     * - This is an 'Instance Initializer Block'.
     * - It triggers during every 'new A()' call BEFORE the constructor body.
     * - Result: A() -> Initializer -> new A() -> Initializer -> new A()...
     * - Error: java.lang.StackOverflowError (Stack memory exhausted by recursive calls).
     *
     * SOLUTION: 'static A obj_og = new A();'
     * - Static members are initialized once when the Class is loaded.
     * - Subsequent object creations (new A) skip the static initialization line.
     */
}

class B extends A {
    B() {
        // Calls A.speak() specifically, even though B overrides it.
        super.speak(); 
        System.out.println("Constructor for Intermediate Class B.");
    }

    @Override
    void speak() { 
        System.out.println("B.speak() [Overridden Version]."); 
    }
}

class C extends B {
    C() {
        // Implicitly calls super() (B's constructor) first.
        System.out.println("constructor Initializing Class C.");
    }

    void talk() { 
        System.out.println("C.talk() [Unique to Class C]."); 
    }
}

class EXP_8_A_prime {
    public static void main(String args[]) {
        
        System.out.println("UPCASTING and POLYMORPHISM");
        /*
         * REFERENCE TYPE: A
         * OBJECT TYPE: C
         */
        A obj = new C(); 
        
        // DYNAMIC METHOD DISPATCH:
        // JVM checks the ACTUAL object type at runtime to find the method.
        // It starts at C, finds no speak(), moves to B, finds speak(), and executes.
        obj.speak(); 

        /* * COMPILE-TIME RESTRICTION:
         * obj.talk(); // ERROR: Method 'talk' not defined in Reference Type 'A'.
         */

        System.out.println("\nFULL ACCESS");
        C obj1 = new C();
        obj1.talk(); // Valid: Reference and Object are both 'C'.

        System.out.println("\nACCESS MODIFIER VALIDATION");
        A obj2 = new A();
        
        // Valid: 'read' is protected and main is in the same package.
        obj2.read(); 
        
        // Invalid: obj2.see(); 
        // Error: 'see' has private access in A (only accessible within A's { }).
    }
}