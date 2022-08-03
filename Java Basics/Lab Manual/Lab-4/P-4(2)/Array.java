import java.util.Scanner;

 class Array{

	public static void main(String[] args){

		System.out.println("Enter your numbers");
		int[] a=new int[4];

		Scanner sc=new Scanner(System.in);
	

		double sum=0;
		

		for (int i=0;i<a.length ;i++ ) {
			a[i]=sc.nextInt();	
			sum=sum+a[i];
		}
		double avg=sum/a.length;
	    System.out.println("Average value of the array element is:" +avg);
	}

}