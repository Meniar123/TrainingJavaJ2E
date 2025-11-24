package myPackage;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stud1 = new Student(105, "ramla", 'B');

		// by reference variable
		stud1.Sid = 100;
		stud1.grade = 'A';
		stud1.sname = "meniar";
		stud1.display();

		// by using method

		stud1.getValues(100, "meniar", 'A');
		stud1.display();

		// by constructor

		stud1.display();
	}

}
