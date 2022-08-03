import java.util.Scanner;
public class Division{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		int english,chemistry,physics,maths,computer;
		double total,percentage;

		System.out.println("Enter marks of 5 subjects");
		english=sc.nextInt();
		chemistry=sc.nextInt();
		physics=sc.nextInt();
		maths=sc.nextInt();
		computer=sc.nextInt();

		total=english+chemistry+physics+maths+computer;
		percentage=(total/500)*100;

		if(percentage>=60)
			System.out.println("First-Division");
		else if(percentage>=50 && percentage<=59)
			System.out.println("Second-Division");
		else if(percentage>=40 && percentage<=49)
			System.out.println("Third-Division");
		else
			System.out.println("Fail");
	}
}