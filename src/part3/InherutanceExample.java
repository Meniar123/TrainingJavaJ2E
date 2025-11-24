package part3;

class A{  // parent 
	int a;
	void display() {
		System.out.println(a);
	}
class B extends A {   //child A
	int b;
	void display() {
		System.out.println(b);
		}
class C extends B{   //child B
	int c;
	void show() {
	    System.out.println(c);
			}
		} 
	}
}

public class InherutanceExample {

	public static void main(String[] args) {
	
// single
		A aobj = new A();
		aobj.a= 100;
		aobj.display();
		
		B bobj = new B();
		bobj.b= 20;
		bobj.a= 10;
		bobj.print();
		bobj.display();
		
	
	}

}
