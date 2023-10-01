package OOP;

//Base class
class Shape{
    String color;

    public void area(){
        System.out.println("Displays Area");
    }
}

// Triangle inherits Shape class
// Inherit class
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}

// Multilevel Inheritence
class Equilateral extends Triangle{
    public void area(int l , int h){
        System.out.println(0.5*l*h);
    }
}

//Hirerchial Inheritence
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.1416*r*r);
    }
}

//HyBrid Inheritence
// Multiple Inheritence not availablel in JAVA

public class Inheritencee {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red ";
    }
}