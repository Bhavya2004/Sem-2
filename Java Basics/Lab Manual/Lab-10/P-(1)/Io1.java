import java.io.*;

public class Io1{
	public static void main (String[] args){

		try{
			FileInputStream fin = new FileInputStream("Io1.txt");
			int a=fin.read(),wordcount=0,linecount=0,charactercount=0;

			while(a!=-1){

				if(a==32){     // for space
					wordcount+=1;
					charactercount--;
				}

				if(a==13){    // /n or enter
					linecount++;
					charactercount-=2;
					wordcount++;
				}

				a=fin.read();
				charactercount++;
			}
			wordcount++;
			linecount++;
			System.out.println("Number of words "+ wordcount);
			System.out.println("Number of lines "+ linecount);
			System.out.println("Number of characters "+ charactercount);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}