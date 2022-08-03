import java.util.Scanner;
public class Pattern1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String s = sc.next();
		int l = s.length();

		for(int i=0;i<l;i++){
			for(int j=0;j<=l-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=i ;k++){
				System.out.print(" "+s.charAt(k));
			}
			System.out.println();
		}
	}
}