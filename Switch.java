public class Switch {
    public static void main(String[] args) {
        //Conditional statements - Switch
        int day = 1;

        switch(day){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Mon - Fri");
        }
    }
}
