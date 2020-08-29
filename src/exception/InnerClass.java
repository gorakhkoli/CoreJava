package exception;

public class InnerClass 
{
	static
	{
		System.out.println("in outer static");
	}
	public InnerClass() {
		System.out.println("in outer const");
	}
	static class Inner
	{
		static
		{
			System.out.println("in inner static");
		}
		Inner()
		{
			System.out.println("in inner const");
		}
		static void m1()
		{
			System.out.println("in m1()");
		}
		 void m2()
		{
			System.out.println("in m2()");
		}
		/*
		 * public static void main(String[] args) { System.out.println("in inner main");
		 * InnerClass.m3();
		 * 
		 * 
		 * }
		 */
	}

	
	  public static void main(String[] args) 
	  { System.out.println("in outer main");
	  	Inner.m1();
	  }
	 
	static void m3()
	{
		System.out.println("in m3()");
	}
	 void m4()
	{
		System.out.println("in m4()");
	}
}
