package OOP;

class Account{
    public String name;
    protected String email;
    private String password;

    //Getters && Setters 
    public String getPasss(){
        //setpasss(randomPass);
        return this.password;
    }

    public void setpasss(String pass){
        this.password =  pass ;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Amader School";
        account1.email = "mostainrifat66@gmail.com";
        account1.setpasss("akfhew32");
        System.out.println(account1.getPasss());
    }
    
}
