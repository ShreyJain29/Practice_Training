package excep;
public class ExcepEx1 {
	int a = 10;
	int b = 0;
	int c[] = new int[5]; 
	int excep()
	{
		try 
		{
			return a/b;				
		}	
		catch(ArithmeticException ae) 
		{
			return 1;
		}
		finally 
		{
		System.out.println("After Exception");
		}
	}
	
	public static int add (a,b) {
		return a+b;
	}
	
	public static int sub(a.b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		ExcepEx1 e = new ExcepEx1();
		System.out.println(e.excep());
		System.out.println(add(5,8));
		System.out.println(sub(5,3));
	}
}
