interface Transport{
	public void deliver();
}
abstract class Animal{

}
class Tiger extends Animal{

}
class Camel extends Animal implements Transport{
	public void deliver(){
		System.out.println("Deliver Deer");
}	}
class Deer extends Animal{

}
class Donkey extends Animal implements Transport{
	public void deliver(){
		System.out.println("Deliver Donkey");
	}
}

class TransportDemo{

	public static void main(String[] args) {
		
		String[] animal = new String[4];
		animal[0]="Tiger";
		animal[1]="Camel";
		animal[2]="Deer";
		animal[3]="Donkey";

		for(int i=0;i<4;i++){

			if(animal[i].equals("Camel")){
				Transport an=new Camel();
				an.deliver();
			}
			if(animal[i].equals("Donkey")){
				Transport an=new Donkey();
				an.deliver();
			}
		}
	}
}