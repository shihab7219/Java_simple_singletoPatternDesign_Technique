package desaignPattern;

public class staticBlockInitialization {
	
	 String firstName = "MD";
	 String lastName = "Shihab";
	 String fullName = firstName + " " + lastName;
	
	private static staticBlockInitialization staticBlockInitialization_obj;
	
	private staticBlockInitialization() 
	{
		
	}
	
	static 
	{
		try
		{
		 staticBlockInitialization_obj = new staticBlockInitialization();
		 
		}
		catch (Exception e)
		{
			throw new RuntimeException("Exception occread in creating the Instance");
		}
	}
	
	public static staticBlockInitialization getInstance() {
		
		return staticBlockInitialization_obj;
	}
	
	

}
