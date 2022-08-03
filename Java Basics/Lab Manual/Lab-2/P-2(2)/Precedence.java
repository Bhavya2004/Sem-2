import java.util.Scanner;
public class Precedence{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter n1=");
		int n1=sc.nextInt();
		System.out.println("Enter n2=");
		int n2=sc.nextInt();
		System.out.println("Enter n3=");
		int n3=sc.nextInt();
		System.out.println("Enter n4=");
		int n4=sc.nextInt();
		System.out.println("Enter n5=");
		int n5=sc.nextInt();
		System.out.println("Enter n6=");
		int n6=sc.nextInt();

		int ans=n1+n2*(n3-n4)/n5*n6;

		System.out.println("Answer of n1+n2*(n3-n4)/n5*n6="+ans);
	}
}