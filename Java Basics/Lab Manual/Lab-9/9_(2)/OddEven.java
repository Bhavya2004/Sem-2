class odd1 implements Runnable{
public void run(){
	for(int i=1;i<=20;i++)
	{
		if(i%2!=0)
		{
			System.out.println("Odd numbers are:"+i);
				try
				{
					Thread.currentThread().sleep(1000);
				}
				catch(Exception e)
				{

				}
		}
	}
}
}
class even1 implements Runnable{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even numbers are:"+i);
					try
					{
						Thread.currentThread().sleep(1000);
					}
					catch(Exception e)
					{

					}
			}
		}
	}
}

class OddEven{
	public static void main(String[] args)
	{
		odd1 o1=new odd1();
			Thread t1=new Thread(o1);
		    t1.start();

		even1 o2=new even1();
			Thread t2=new Thread(o2);
		    t2.start();
    

	}
}