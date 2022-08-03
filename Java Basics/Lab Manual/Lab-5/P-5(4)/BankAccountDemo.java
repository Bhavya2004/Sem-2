 import java.util.Scanner;
class BankAccount{
	String accountnumber;
	String userName;
	String email;
	String accounttype;
	double accountbalance;

	Scanner sc=new Scanner(System.in);

	void getAccountDetails(){
		System.out.println("Enter Account Number");
		accountnumber=sc.next();
		System.out.println("Enter username");
		userName=sc.next();
		System.out.println("Enter Email");
		email=sc.next();
		System.out.println("Enter Account Type");
		accounttype=sc.next();
		System.out.println("Enter Account Balance");
		accountbalance=sc.nextDouble();
	}
	void displayAccountDetails(){
		System.out.println("--------AccountDetails------=");
		System.out.println("Account Number= "+accountnumber);
		System.out.println("Username= "+userName);
		System.out.println("Email= "+email);
		System.out.println("Account Type= "+accounttype);
		System.out.println("Account Balance= "+accountbalance);
	}
}
class BankAccountDemo{
	public static void main(String[] args){

		BankAccount ba=new BankAccount();

		ba.getAccountDetails();
		ba.displayAccountDetails();
	}
}