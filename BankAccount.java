import java.util.Scanner;
class Account{
    int balance=0;
    String customerName;
    int accountBalance;

    public Account(String name, int account_no){
        this.customerName = name;
        this.accountBalance = 0;
    }

    public void deposit(int depositAmt) {
        balance = balance + depositAmt;
    }

    public void displayBalance() {
        System.out.println("Your current available balance is :"+balance);

    }

    public void withdrowBalance(int withAmt) {

        if(balance>withAmt)
            balance = balance - withAmt;
        else
            System.out.println("Insufficient balance");

        System.out.println("Your withdrawal amount "+balance +" is success\n Thank you");
    }


}

class SavingAccount extends Account{
    static int min_bal = 1000;

    public SavingAccount(String name, int account_no) {
        super(name, account_no);

    }

    public void checkMinBal() {
        if(balance < min_bal) {
            //assuming 100 rupees to be imposed as penalty
            balance = balance - 100;
        }
    }

}

class CurrentAccount extends Account{
    static int min_bal = 4000;

    public CurrentAccount(String name, int account_no) {
        super(name, account_no);

    }

    public void checkMinBal() {
        if(balance < min_bal) {
            //assuming 200 rupees to be imposed as penalty
            balance = balance - 200;
        }
    }

}



public class BankAccount {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("1. Saving Account, 2. Current Account - ");
        int option = sc.nextInt();

        if (option == 1) {
            System.out.print("Enter Name - ");
            String name = sc.next();

            System.out.print("Enter Account Number - ");
            int accountNumber = sc.nextInt();

            SavingAccount sa = new SavingAccount(name, accountNumber);

            System.out.print("Deposit Amount - ");
            int depositAmount = sc.nextInt();
            sa.deposit(depositAmount);

            sa.displayBalance();

            System.out.print("Withdrawl Amount - ");
            int withdrawlAmount = sc.nextInt();
            sa.withdrowBalance(withdrawlAmount);

            sa.displayBalance();
        } else {

            System.out.print("Enter Name - ");
            String name = sc.next();

            System.out.print("Enter Account Number - ");
            int accountNumber = sc.nextInt();

            CurrentAccount ca = new CurrentAccount(name, accountNumber);

            System.out.print("Deposit Amount - ");
            int depositAmount = sc.nextInt();
            ca.deposit(depositAmount);

            ca.displayBalance();

            System.out.print("Withdrawl Amount - ");
            int withdrawlAmount = sc.nextInt();
            ca.withdrowBalance(withdrawlAmount);

            ca.displayBalance();
        }
    }
}