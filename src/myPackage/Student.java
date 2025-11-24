package myPackage;

public class Student {
	int Sid;
	String sname;
	char grade;

	//Assign variable by using method

	void getValues(int id, String name, char g) 
	{
		Sid = id;
		sname = name;
		grade = g;

	}

// Assign by constructor
	Student(int id, String name, char g) {
		Sid = id;
		sname = name;
		grade = g;
		
	}


	void display() {
		System.out.println(Sid + "" + sname + "" + grade);
	}

	
}
