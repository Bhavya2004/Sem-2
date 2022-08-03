import java.util.Scanner;
public class Temperature{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter temp. in fahrenheit");
		float F=sc.nextFloat();

		float C=(F-32)*5/9;

		System.out.println("Answer in celcius is:"+C);
	}
}