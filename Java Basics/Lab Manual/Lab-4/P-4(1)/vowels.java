import java.util.Scanner;
import java.io.*;

class vowels
{
	public static void main(String[] args) {
		int vow=0,con=0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter Your sentence");
		String s1=sc.nextLine();
		
		int l=s1.length();
		String s2=s1.toLowerCase();
		
		
		
		for(int i=0;i<l;i++){
		
		char ch=s2.charAt(i);
		
		
 		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
 		{
 			vow++;
 		}
 		else
 		{
 			con++;
 		}
		 }
 		System.out.println("Vowels="+vow);
 		System.out.println("consonants="+con);

	}
}