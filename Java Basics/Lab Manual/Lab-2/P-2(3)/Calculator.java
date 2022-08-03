import java.util.Scanner;
public class Calculator{
	public static void main(String args[]){

		double num1,num2,result;
		char operator;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 1st number");
		num1=sc.nextInt();

		System.out.println("Enter 2nd number");
		num2=sc.nextInt();

		System.out.println("Enter an operator (+,-,*,/):");
		operator=sc.next().charAt(0);

		switch(operator)
		{
		case '+':
			result=num1+num2;
			break;

		case '-':
			result=num1-num2;
			break;

		case '*':
			result=num1*num2;
			break;
		
		case '/':
			result=num1/num2;
			break;
		
		default:
			System.out.println("Incorrect operator");
			return;
		}
	System.out.println(num1 +" "+ operator+ " "+num2+"=" +result );
	}
}