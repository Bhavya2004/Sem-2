class Count{
	static  int count=0;

	Count(){
		count++;
		System.out.println(count);
	}
}

class Usestatic{
	public static void main(String[] args){
		Count a=new Count();
		Count a1=new Count();
		Count a2=new Count();
	}
}