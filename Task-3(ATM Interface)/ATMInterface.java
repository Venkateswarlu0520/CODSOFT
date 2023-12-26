import java.util.Scanner;

class BankAccount{
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance=initialBalance;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount>=100) {
			balance+= amount;
			System.out.println("Deposit of $" +amount+ " Successful ! Available balance: $" +balance);
		}else {
			System.out.println("Invalid amount for deposit.");
		}
	}
	public void withdraw(double amount) {
		if(amount>0&&amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawal of $" +amount+ " Successful and Remaining balance: $" +balance);
		
		}else {
			System.out.println("Insufficient funds!");
		}
	}
}
class ATM{
	private BankAccount userAccount;
	
	public ATM(BankAccount bankAccount) {
		this.userAccount=bankAccount;
		
	}
	public void displayMenu() {
		System.out.println("ATM Menu");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit amount");
		System.out.println("3. withdraw amount");
		System.out.println("4. Exit");
	}

	public void makeTransaction(int choice, Scanner scn) {
		switch(choice) {
		case 1:
			System.out.println("Current balance: $" +userAccount.getBalance());
			break;
		case 2:
			System.out.print("Enter deposit amount: $");
			double depositAmount=scn.nextDouble();
			userAccount.deposit(depositAmount);
			break;
		case 3:
			System.out.print("Enter withdrawal amount:$ ");
			double withdrawalAmount=scn.nextDouble();
			userAccount.withdraw(withdrawalAmount);
			break;
		case 4:
			System.out.println("Exiting ATM. Thank you!");
			scn.close();
			System.exit(0);
		default:
			System.out.println("Invalid option.please select a valid option.");
	}
}
}
   public class ATMInterface{
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Welcome to ATM");
	System.out.print("Enter initial account balance:$");
	double initialBalance=scn.nextDouble();
	BankAccount bankAccount=new BankAccount(initialBalance);
	
	ATM  atm=new ATM(bankAccount);
	
	while(true) {
		atm.displayMenu();
		System.out.println("Select your choice:");
		int choice=scn.nextInt();
		atm.makeTransaction(choice, scn);
	}
 }
}
