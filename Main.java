package calculadora;

public class Main 
{

	public static void main(String[] args) 
	{
		View view = new View();
		
		Controler manager = new Controler(view);
		
		view.event(manager);
	}
}
