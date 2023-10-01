package OOP;

class Pen{
    String color;
    String type; 

    public void write()
    {
        System.out.println("Writing Something...");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //Constructor
    /* Student(String name, int age ){
        System.out.println("Constructor Calling......");
        this.name = name;
        this.age = age;
    } */
    
    //Copy Constuctor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    //Constructor
    Student(){

    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.type = "Gel";
        
        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "Water";
          
        pen1.printColor();
        pen2.printColor();

        pen1.write();

        Student s1 = new Student();
        s1.name = "Ally";
        s1.age = 22;

        Student s2 = new Student(s1);

        s2.printInfo();
    }
}
