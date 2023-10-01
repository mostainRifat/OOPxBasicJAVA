package OOP;


//Not a pure abstract ... Dont hides all Unuseful Method
abstract class Animal{
    Animal(){
        System.out.println("Creating a animal....");
    }
    // Must have method for every Inherit Class
    abstract void walk(); 

    // Not a Abstract class
    public void eat(){
        System.out.println("Animal Eats....");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Creating a horse....");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Hen extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Horse horse = new Horse ();
        horse.walk();
        horse.eat();

        // Animal animal = new Animal();
        // Cannot use Abstract Class
        
    }
}