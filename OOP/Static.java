package OOP;

class Student{
    String name;
    static String school; 
}

public class Static {
    public static void main(String[] args) {
        //School is Static
        //Same for every student
        Student.school = "PGHS";

        Student student1 = new Student();
        student1.name = "Tony";
        System.out.println(student1.school);
    }
}
