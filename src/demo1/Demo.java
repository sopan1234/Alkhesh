package demo1;

public class Demo {
	
	static int i=2;
	
	static
	{
		i=i-- + --i;
	}
	{
		i=i++ + ++i;
	}
	
	int method()
	{
		return i + i - i * i / i ;
	}
	 
	
	public static void main(String[] args) {
		
		System.out.println(new Demo().method());
	}
	
	

}
