package ConstructorChaining;

public class C extends B{
    C(){

    }
    C(int c){
      super(4,5);
        System.out.println("constructor of C ");
       // super(3); // it should be first statement in constructor
    }
}
