package myPackage;

public class employeeMain {

	public static void main(String[] args) {
		
		
		// creating object > instance d'une class
		
		
		employee emp1= new employee();
		emp1.eid = 1011;
		emp1.ename = "meniar";
		emp1.job= "test automation";
		emp1.salaire = 80.00;
		emp1.deptno = 15;
		emp1.display();
		
		//creating object 2
		
		employee emp2 = new employee();
		
		emp2.eid = 1020;
		emp2.ename = "lamine";
		emp2.salaire = 90.00;
		emp2.job = "developpeur";
		emp2.display();
		
				
		
		
	}

}
