class Multiplication{
	public static void main(String args[]){
		

		try{
			int x=Integer.parseInt(args[0]);
		    int y=Integer.parseInt(args[1]);
			int ans=x*y;
			System.out.println(ans);
		}
		catch(Exception e)
		{
			System.out.println("Please Enter a valid value");
		}
	}
}