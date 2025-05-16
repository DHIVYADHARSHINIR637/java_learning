package dhivya;
import java.util.*;
class BankAccount{
    int AccountNumber;
     String accountHolderName;
     double balance;
     void setDetails(int AccountNumber,String accountHolderName,double balance){
    	 this.AccountNumber=AccountNumber;
    	 this.accountHolderName=accountHolderName;
    	 this.balance=balance;
     }
     void deposit(double amount){
    	 balance+=amount;
    	 System.out.println("Balance after deposit:"+balance);
    	 
     }
     void withdraw(double amount){
    	 if(balance>=amount){
    		 balance-=amount;
    		 System.out.println("Balance after withdrawal:"+balance);
    	 }
    	 else{
    		 System.out.println("insufficient balance!");
    	 }
    }
     public void displayAccountDetails(){
    	 System.out.println("AccontNumber: "+AccountNumber);
    	 System.out.println("Accont Holder Name: "+accountHolderName);
    	 System.out.println("Balance: "+balance);
    	 }
}
public class Prog30 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		BankAccount obj=new BankAccount();
		System.out.println("Enter account number:");
		int AccountNumber=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder Number:");
		String accountHolderName=sc.nextLine();
		System.out.println("Enter intial balance:");
		double balance=sc.nextDouble();
		obj.setDetails(AccountNumber,accountHolderName,balance);
		System.out.println("Enter deposit amount:");
		double depositAmount=sc.nextDouble();
		obj.deposit(depositAmount);
		System.out.println("Enter withdraw amount:");
		double withdrawAmount=sc.nextDouble();
		obj.withdraw(withdrawAmount);
		System.out.println("Final account details:");
		obj.displayAccountDetails();
		
	}

}
