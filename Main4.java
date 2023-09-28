class Bank {
    private double balance;
    void deposit(double amount){
        balance=balance +amount;
    }    
void withdrawal(double amount){
    if(balance>=amount){
        balance=balance-amount;
    }
    else{
        System.out.println("Insufficient Balance!!");
    }
}
double getBalance(){
    return balance;
}
}
public class Main4{
    public static void main(String[] args) {
        Bank p1=new Bank();
        Bank p2=new Bank();
        p1.deposit(10000);
        p1.withdrawal(10);
        System.out.println(p1.getBalance());;
        
        
        
    }
}
