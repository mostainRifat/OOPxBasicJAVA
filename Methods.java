public class Methods {
    public static void printJava(){
        System.out.println("Hello Trump");
    }
    public static void printName(String name)
    {
        System.out.println(name);
    }
    public static void printsum(int a,int b)
    {
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
       printJava();
       printName("Doland");
       printsum(10,20);
    }
}
