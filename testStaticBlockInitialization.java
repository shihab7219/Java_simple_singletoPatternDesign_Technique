package desaignPattern;

public class testStaticBlockInitialization {
	
	public static void main(String[] tsbi) {
		
		staticBlockInitialization name = staticBlockInitialization.getInstance();
		
		
		
		System.out.println(name.fullName);
	}

}
