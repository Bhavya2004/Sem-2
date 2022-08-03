import java.util.Scanner;
public class Palindromestr{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter String:");
		String str=sc.next();
		int len=str.length(),flag=0;

		for (int i=0;i<len ;i++ ) {
			if(str.charAt(i)!=str.charAt(len-i-1))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Given String is Palindrome");
		else 
			System.out.println("Given String is not Palindrome");
	}
}