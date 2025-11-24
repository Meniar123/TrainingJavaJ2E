package Part4;

class A {
	
	void m() {
		System.out.println("this is mehod from A class");
	}
	
	
interface B2 {
              void m2();

interface C2 { 
	          void m3();
	}
}
}




public class hybridInheritance extends A implements B2, C2 {
	
	public void m2() {
		System.out.println("this is method m2 from interface B2");
	}
	public void m3() {
		System.out.println("this is method m3 from interface C2");
	}
	
	
	public static void main(String[] args) {
		
		hybridInheritance test = new hybridInheritance();
		test.m2();
		test.m3();
	    test.m();
		

	}

}
