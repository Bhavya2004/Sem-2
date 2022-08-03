import java.util.Scanner;
public class Maximumfrom3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3,largest;

		System.out.println("Enter 1st number");
		n1=sc.nextInt();
		System.out.println("Enter 2nd number");
		n2=sc.nextInt();
		System.out.println("Enter 3rd number");
		n3=sc.nextInt();

		largest= (n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);

		System.out.println("Largest Number="+largest);
	}
}