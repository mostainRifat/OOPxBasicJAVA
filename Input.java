import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // How to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Age: ");
        int age = sc.nextInt();
        System.out.println(age);

        // String Input
        System.out.print("Input your Name: ");
        String name = sc.next();
        System.out.println(name);

        // Sentence input
        System.out.println("Input your Complete Name: ");
        String nname = sc.nextLine();
        System.out.println(nname);

    }
}
