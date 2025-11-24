package Part4;

interface A {
	int a = 10;  //static by default (variable static and final in interface )
	void m1();  // abstract method without implementation of code >> public by default
}

class B {
	int b;
}


public class TestInterface extends B implements A {
	 // here we implement the method
	public void m1() {
		System.out.println(a);
	}
	
	
	
	
    public static void main(String[] args) {
    	// we accees to the method
		
    	TestInterface t1 = new TestInterface ();
    	t1.m1();
    	
	}

}
