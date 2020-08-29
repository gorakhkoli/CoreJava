package exception;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		new ExceptionHandling().m1();
	}
	public String m1()
	{
		int a=0;
		try {
			a=10;
			System.out.println("in try"+a);
			System.err.println(1/0);
			return null;
		} catch (NullPointerException e) 
		{
			//a=20;
			System.out.println("in catch1"+a);
		}
		catch (Exception e) 
		{
			a=20;
			System.out.println("in catch2"+a);
			return null;
		}
		System.out.println("in afetr try"+a);
		return null;
		
	}

}
