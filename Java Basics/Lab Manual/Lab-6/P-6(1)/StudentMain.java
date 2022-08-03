import java.util.Scanner;
class Student
{
	int id_no;
	int no_of_subjects_registered;
	String[] subject_code;
	int[] subject_credits;
	String[] grade_obtained;
	double spi;
	int[] grade_point;
	int sum=0,sum1=0;

	Student()
	{
		no_of_subjects_registered=5;
		
		subject_credits[0]=4;    //dbms
		subject_credits[1]=4;    //foe
		subject_credits[2]=5;    //oop
		subject_credits[3]=6;    //maths
		subject_credits[4]=3;    //egd
	}

	void calculate_spi()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks of OAT");
		int m[0]=sc.nextInt();
		System.out.println("Enter marks of DBMS");
		int m[1]=sc.nextInt();
		System.out.println("Enter marks of FOE");
		int m[2]=sc.nextInt();
		System.out.println("Enter marks of OOP");
		int m[3]=sc.nextInt();
		System.out.println("Enter marks of MATHS");
		int m[4]=sc.nextInt();
		System.out.println("Enter marks of EG");
		int m[5]=sc.nextInt();
		
			for (int i=0;i<=6 ;i++ ) 
			{
				if (m[i]>=85 && m[i]<=100)
				{
				  grade_point[i]=10;
				}
				else if(m[i]>=75 && m[i]<=84)
				{
				  	grade_point[i]=9;
				}
				else if(m[i]>=65 && m[i]<=74)
				 {
				  	grade_point[i]=8;
				 }
				else if(m[i]>=55 && m[i]<=64)
				  {
				  	grade_point[i]=7;
				  }
				else if(m[i]>=45 && m[i]<=54)
				  {
				  	grade_point[i]=6;
				  }
				else if(m[i]>=40 && m[i]<=44)
				  {
				  	grade_point[i]=5;
				  }
				else if(m[i]>=35 && m[i]<=39)
				  {
				  	grade_point[i]=4;
				  }
				else
					{
					grade_point[i]=0;
					}

				this.sum=sum+(subject_credits[i]*grade_point[i]);
				this.sum1=sum1+subject_credits[i];
			}
				spi=sum/sum1;
				System.out.println("Your SPI IS-"+spi);
				
	}
}

 class StudentMain{
 	public static void main(String[] args){
 		Student s=new Student();
 		s.calculate_spi();
 	}

 }