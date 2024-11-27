package Polymorphism;

public class MethodOverloading {
    // register
    public void register(){
        System.out.println("User register is executing");
    }

    // registering name
    public void register(String email){
        System.out.println("email is " +  email);
    }
    // registering email and password
    public void register(String email, String password){
        System.out.println("Email is " + email + "password is "  + password);
    }

 // Method Overloading

 // Method signature
 //  Name_function (data_type1 , data_Type2 ......)
 // return type doesn't bring any change to method signature

}
