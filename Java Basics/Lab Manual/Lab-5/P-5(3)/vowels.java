import java.util.Scanner;
import java.io.*;

class vowels
{
	public static void main(String[] args) {
		int vow=0;
		
		Scanner sc = new Scanner (System.in);
		
		while(true)
		{
			System.out.println("Enter your String,Type quit to exit");
			String str=sc.nextLine();

			if(str.equals("quit"))
 			{
 			break;
 			}
 	
 			else{

				for(int i=0;i<str.length();i++)
				{
 			 		if (str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'
 					|| str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
 				    {
 			         vow++;
 					}
 	  			}
			}
		}
 		System.out.println("Vowel Count= "+vow);
  }
}