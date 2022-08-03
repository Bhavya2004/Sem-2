import java.util.Scanner;

class ReverseArray{

	public static void main(String[] args){
		int[] a=new int[5];
        
        Scanner sc=new Scanner(System.in);
		System.out.println("Original Array");
		

		for (int i=0;i<a.length ;i++ ) {
		a[i]=sc.nextInt();
		}
		System.out.println("--------");

		for (int i=a.length-1;i>=0 ;i-- ) {
			
			System.out.println(a[i]);
		}
		

	}
}