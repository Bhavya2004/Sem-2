import java.util.Scanner;
public class AdditionTwoNumber{
	public static void main (String args[]){

		int num1,num2,sum;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 1st number");
		num1=sc.nextInt();

		System.out.println("Enter 2nd number");
		num2=sc.nextInt();
	 
        sum=num1+num2;
        System.out.println("Sum of these numbers:"+sum); 
	}
}