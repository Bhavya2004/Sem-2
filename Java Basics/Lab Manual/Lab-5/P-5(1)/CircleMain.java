import java.util.Scanner;

class CircleArea{
	void circleMethod (double r){
		double result=3.14*r*r;
		System.out.println("Answer="+result);
	}
}
	class CircleMain{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter radius");
			double r=sc.nextDouble();
			CircleArea cm=new CircleArea();
			cm.circleMethod(r);
		}
	}
