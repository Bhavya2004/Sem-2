class Count{
	 static int count=0;

	Count(int count){
		this.count=count;
		count++;
		System.out.println(count);
	}
}

class Useofthisandstatic{
	public static void main(String[] args){
		Count a=new Count(3);
		
		
	}
}