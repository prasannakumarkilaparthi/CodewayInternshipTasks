import java.util.Scanner;
class Bankaccount{
    double balance;

    public Bankaccount(double initamonunt){
        balance=initamonunt;
    }
    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }
    public boolean withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            return true;
        }
     return false;

    }
}

class Atm{
    public  Bankaccount account;

    public Atm(Bankaccount baccount){
        account=baccount;
    }

    public void display(){
        while(true){
            System.out.println("ATM MENU:");
            System.out.println("1.Check balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.print("Enter Your choice:");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Your Balance in account: "+account.getBalance());
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter amount to deposit:");
                    double newdeposite=sc.nextDouble();
                    account.deposit(newdeposite);
                    System.out.println("Deposite succesfull. Your total balance is " +account.getBalance());
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw:");
                    double newwithdraw=sc.nextDouble();
                    if(account.withdraw(newwithdraw)){
                    System.out.println("Withdraw successful. Your balance is " +account.getBalance());
                    }
                    else{
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Thaks for using ATM");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }
    }
}