package Part2;

public class StaticsExamples {
	
	static int a=10;  //static variable
	int b=20; // non static variable
	
	
	static void m1() {  //static method
		System.out.println("this is m1 static method");
		//access to variable b directly - non static
		//create object
		
		StaticsExamples se = new StaticsExamples();
		System.out.println(se.b);
	}
		void m2() {  
			System.out.println("this is m2 no static method");	
		}
		void m3() {
			System.out.println("this is m3 o static method ");
			System.out.println(a);
			System.err.println(b);
			m1();
			m2();
			
			
		}
	}
	
	
	public static void main(String[] args) {
	
// static method -----> only static without object
		
		System.out.println(a);
		System.out.println(StaticsExamples.a);
		m1();
		StaticsExamples.m1();
		// m2(); // non static 
		StaticsExamples M = new StaticsExamples();    // non static faut qu'on créé un objet )
		System.out.println(b);
		M.m2();
		M.m3();
		
		
		
		
		
	}

}
