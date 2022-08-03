import java.util.Scanner;
public class WithdrawalException{
		public static void main(String[] args) {
		int balance=5000;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amount of withdraw : ");
		int withdrow=sc.nextInt();
		try{
			if (balance>=withdrow) {
				balance=balance-withdrow;
				System.out.println("new balance : "+balance);
			}
			else{
				throw new Exception();
			}
		}
		catch(Exception e)
		{
			System.out.println("Not sufficient balance available");
			e.printStackTrace();
		}
	}
}