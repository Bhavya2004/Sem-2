import java.util.Scanner;

abstract class VegetablesDemo
{
	String color;
    abstract public String toString();
}
	class Potato extends VegetablesDemo
	{
		   public String toString()
		    {
			color="yellow";
			return color;
		    }
	}
	class Brinjal extends VegetablesDemo
	{
		    public String toString()
		    {
			color="violet";
			return color;
		    }
	}
	class Tomato extends VegetablesDemo
	{
			public String toString()
			{
			color="red";
			return color;
		    }
	}

class Vegetables{
	
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			

			System.out.print("Enter Vegetable : ");

			String vegetable = sc.nextLine();

			vegetable=vegetable.toLowerCase();

			if(vegetable.equals("potato")){
				VegetablesDemo v = new Potato();
				String p=v.toString();
				System.out.print("Color of Potato is "+p);
			}

			else if(vegetable.equals("brinjal")){
				VegetablesDemo v = new Brinjal();
				String b=v.toString();
				System.out.print("Color of Brinjal is "+b);
			}

			else if(vegetable.equals("tomato")){
				VegetablesDemo v = new Tomato();
				String t=v.toString();
				System.out.print("Color of Tomato is "+t);
			}
			else{
				System.out.print("Invalid input");
			}


		}
	}