package part3;

//-----------1
public class Animal {
	
	
	String color = "white";
	
	
//-----------2
	void eating() {
		System.out.println("EATING-------------");
	}
	
	//--------3
  Animal(){  // constructor 
	  System.out.println("Animal is created");
  }
}
  
  
  
  class dog extends Animal{
	  // we can also call this overriding -different body
	  String color="black";
	  
	dog() {
		  super();
		  System.out.println("Dog is created");
	  }
	void displayColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	void eating() {
		System.out.println("Eating bread-----------");
		super.eating();
	}
  }

