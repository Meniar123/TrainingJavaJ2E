package Part2;

public class methodOverLoading {
	//same name of method- different parameters
	
	void add( int a, int b )    //1
	{
		System.out.println(a+b); 
	}
	void add( int a, double b ) //2
	{
		System.out.println(a+b);
	}
	void add( double a, double b) //3
	{
		System.out.println(a+b);
	}
	void add( int a, int b, int c) //4
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		methodOverLoading mo = new methodOverLoading();
		mo.add(10,20);
		mo.add(10, 10.50);
		mo.add(20.30, 0.20);
		mo.add(10, 20, 30);
		
		
		

	}

}
