class InsBalException extends Exception{
    public InsBalException(String message){
        super(message);
    }
}
public class U3P8 {
    private double balance;
    public U3P8(double balance){
        this.balance = balance;

    }
    public void withdraw(double Amount){
        if(Amount > balance){
            throw new InsBalException("Insufficient balance in account");
        }
        balance -= Amount;
        System.out.println("Withdrawal successful. \n Remaining balance:"+balance);
    }
    public static void main(String[] args) {
        U3P8 account =new U3P8(1000.0);
        try{
            account.withdraw(600.0);
            account.withdraw(500.0);

        }catch(InsBalException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
    
}
