package ConstructorChaining;

public class B extends  A{
    B(){
        super();// A class constructor will be called
        System.out.println("I am from B class");
    }
    B(int n){
        this(); // B class constructor will be called
        System.out.println("I am from B with value n is " + n);
    }

    B(int n, int m){
        this(5);// B class constructor with single parameter will be called
        System.out.println("I am from B with values  n " + n + " m " + m );
    }
}
