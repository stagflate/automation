package automation;

//https://www.youtube.com/watch?v=8uSiZdne-_k&list=PLhW3qG5bs-L_qj1L5hnHvJYeFpQ_g4UuU&index=13

public class ExceptionHandlingDemo 
{

	public static void main(String[] args)
	{
		demo();
		try {unhandledDemo();}
		catch (Exception e2) {e2.printStackTrace();}
	}
		
		public static void unhandledDemo() throws Exception
		{
			System.out.println("Hello from unhandled demo!");
			int i = 1/0;
			System.out.println("Completed");
		}
		
		public static void demo()
		{
		
			try {
		
		
		System.out.println("Hello World...");
		int i = 1/0;
		System.out.println("Completed!");
		}
	catch(Exception e)
		{
		System.out.println("I am inside catch block");
		System.out.println("Error message is: " + e.getMessage());
		System.out.println("Cause is: " + e.getCause());
		e.printStackTrace();
		}
	finally //finally block always executes,
			//whether or not there's an exception
	{
		System.out.println("I am inside the finally block");
	}
	
	}
}
