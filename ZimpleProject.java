import java.util.Scanner;

public class ZimpleProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random()* 100);
        int userNum =00;

        do{
            System.out.println("Guess My number : ");
            userNum = sc.nextInt();

            if(userNum == myNum){
                System.out.println("yeeees ... Correct Number !!");
                break;
            }
            else if(userNum > myNum){
                System.out.println("Your Number is Larger");
            }
            else
                System.out.println("Your number is Smaller ");
        }
        while(userNum >= 0);

        System.out.println("My number was : ");
        System.out.println(myNum);
    }
}
