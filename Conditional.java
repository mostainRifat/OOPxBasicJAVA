import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        //Conditional Statement
        boolean isSunUp = true;
        if(isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("Night");

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Age: ");
        int age = sc.nextInt();
        if(age > 18)
        System.out.println( "Can Vote");
        else 
        System.out.println("Cannot Vote");
    }
}
