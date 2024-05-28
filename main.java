import java.util.Scanner;

class BankAccount{
private int balance ;
int amount;

public BankAccount(int initialAmount){
    this.balance = initialAmount;
}

public int balance(){
    return balance;
}
public void deposit(int amount){
    if(amount > 0)
    {
      balance+=amount;
      System.out.println("deposit of " + amount + " Rs was successfull");

    }else{
        System.out.println("inavalid entry!. Please choose a number above 0 ");

    }
}
public void withdraw(int amount){
    if( amount > 0 && amount<balance){
        System.out. println("withdraw successfull of "+amount+"Rs");
        amount-=balance;

    }
    else{
        System.out. println("inavalid entry!!.Insufficient balance or negative value entered");
    }
}
}
class ATM
{
    private BankAccount account; // this create a variable which canbe only used in ATM
    public ATM(BankAccount account){
        this.account=account;

    }
    public void display(){
        System.out. println("Select options");
        System.out. println("1.Check Balance");
        System.out. println("2.Deposit");
        System.out. println("3.WithDraw");
        System.out. println("4.Leave");
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            display();
            System.out. println("pick an option");
            option = sc.nextInt();

            switch(option){
                case 1:
                System.out. println("Current balance " +account.balance(/*  this will be created in user method later*/));
                break;
                case 2:
                System.out. println("Enetr the amount to deposit");
                int depositAmount = sc.nextInt();
                account.deposit(depositAmount);
                break;
                case 3:
                System.out. println("Enter amount to withdraw");
                int withdrawAmount = sc.nextInt();
                account.withdraw(withdrawAmount);
                case 4:
                System.out.println("Thanks for working with indus bank");
                break;
                default:
                System.out.println("inavalid entry!!.Enter only given deposit") ;
            }

        }while(option != 4);
        sc.close();


    }
    
}
public class main{
    public static void main(String[] args){
        BankAccount UserAccount = new BankAccount(10000);
        ATM atm = new ATM(UserAccount);
        atm.run();
    }
}