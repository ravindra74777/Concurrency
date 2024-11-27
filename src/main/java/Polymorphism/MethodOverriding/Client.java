package Polymorphism.MethodOverriding;

public class Client {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();


        Animal aniDog =new Dog();
        aniDog.makeSound();
    }
}
