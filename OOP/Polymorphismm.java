package OOP;
//NOT RUNNING IN THE VS CODE
class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println("Student Name: " + name);
    }

    public void printInfo(int age) {
        System.out.println("Age : " + age);
    }

    public void printInfo(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Age : " + age);
    }
}

public class Polymorphismm {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "Allu";
        s1.age = 42;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}
