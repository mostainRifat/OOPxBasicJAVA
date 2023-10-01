public class ExceptionHandling {
    public static void main(String[] args) {
        int[] marks = {89 , 98, 82};
        try{
        System.out.println(marks[5]);
        }
        catch(Exception exception)
        {
            //do something after catching
        }
        System.out.println("Hello Trump");
    }
    
}
