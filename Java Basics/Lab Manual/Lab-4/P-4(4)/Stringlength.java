import java.util.Scanner;

class Stringlength{
	public static void main(String[] args){
		String a=new String();
		System.out.println("Enter your sentence");
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();

		System.out.println(a.length());
		System.out.println(a.substring((a.length())/2));


	}
}