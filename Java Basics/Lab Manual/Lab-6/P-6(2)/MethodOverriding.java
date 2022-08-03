class Book{

	private String authorName;

	public Book(String authorName){
		this.authorName=authorName;
	}

	public void display(){
		System.out.print("Author Name : "+authorName);
	}

}

class BookPublication extends Book{
	private String title;
	public BookPublication(String title){
		super("");
		this.title=title;
	}

	public void display(){
		System.out.print("Title : "+title);
	}
}

class PaperPublication extends Book{


	private String title;

	public PaperPublication(String title){
		super("");
		this.title=title;
	}

	public void display(){
		System.out.print("Title : "+title);
	}
}

public class MethodOverriding{
	public static void main(String[] args) {
		Book b = new Book(args[0]);

		Book b1 = new BookPublication(args[1]);

		b1.display();
	}
}