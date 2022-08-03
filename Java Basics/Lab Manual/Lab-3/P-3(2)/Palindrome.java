import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number");
		int n=sc.nextInt();

		int remainder,rev=0;
		int a=n;

		while(n>0)
		{
			remainder=n%10;
			rev=(rev*10)+remainder;
			n=n/10;
		}
		if (rev==a)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
	}
}