package Part4;

interface ABC {
	int x =100; // static 
	void m1();  // abstract
}


interface XYZ {
	int y= 200;  // static
	void m2();   // abstract
	
}


public class MultipleInheritance implements ABC , XYZ {
	
	public void m1() {
		System.out.println(x);
	}
	
	public void m2() {
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		
		MultipleInheritance M = new MultipleInheritance();
		M.m1();
		M.m2();
		

	}

}
