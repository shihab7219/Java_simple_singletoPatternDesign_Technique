package desaignPattern;

public class EagerInitialization {
	
	public  int a1 = 10;
	
	//Eager Initialization 
	
	private static final EagerInitialization spOBJ1 = new EagerInitialization();
	
	private EagerInitialization()
	{
		
	}
	
	public static EagerInitialization getInstanceObj() {
		return spOBJ1;
	}
	
	
}
