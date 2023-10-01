package OOP;


//interface == Pure Abstraction...
//All methods are public by default
interface Animal{
    void walk();
    //void eat();
}

//The type Horse must implement
//the inherited abstract method Animal.eat()
class Horse implements Animal{
    public void walk(){
        System.out.println("Walking on 4 legs...");
    }
}

public class IInterface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
