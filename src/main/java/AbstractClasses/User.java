package AbstractClasses;

public abstract class User {
    private String name;
    private String password;
    private String email;

    public void login(){
        System.out.println("profile was added");
    }
    public abstract void addProfile();
}
