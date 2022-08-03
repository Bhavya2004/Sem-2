interface EventListener
{
	public void performEvent();
}
interface MouseListener extends EventListener
{
	
	public void mouseClicked();
	public void mousePressed();
	public void mouseReleased();
	public void mouseMoved();
	public void mouseDragged();
	
}

interface KeyListener extends EventListener
{	
	public void keyPressed();
	public void keyReleased();
}

class EventDemo implements MouseListener,KeyListener
{
	
	public void mouseClicked()
	{
		System.out.println("Mouse Clicked!!");
	}
	public void mousePressed()
	{
		System.out.println("mouse Pressed!!");
	}
	public void mouseReleased()
	{
		System.out.println("mouse Released!!");
	}
	public void mouseMoved()
	{
		System.out.println("mouse Moved!!");
	}
	public void mouseDragged()
	{
		System.out.println("mouse Dragged!!");
	}
	public void keyPressed()
	{
		System.out.println("key Pressed!!");
	}
	public void keyReleased()
	{
		System.out.println("key Released!!");
	}
	public void performEvent()
	{

	}
 }


public class Mousemain
{
	public static void main(String[] args)
	{
	EventDemo ed=new EventDemo();
	ed.keyPressed();
	ed.keyReleased();
	ed.mouseClicked();
	ed.mouseDragged();
	ed.mouseMoved();
	ed.mousePressed();
	ed.mouseReleased();	
	}
}
