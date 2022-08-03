import java.util.Scanner;

public class Cmdline{

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(s.charAt(0)>='a' && s.charAt(0)<='z'){
			
				System.out.println("error");
			
		}
	}
}