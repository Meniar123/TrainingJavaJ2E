package part3;

class Bank {
	double ineterestRate() {
		return 0;

	}
}

  class SBI extends Bank {

	// same name
  double interestRate() {
		return 5.5;
	}

  class AXIS extends Bank {

  double interestRate() {
			return 6.5;
  }	
			
			
public class Overridingmethodd {

	public static void main(String[] args) {
		
	}
		SBI sbi = new SBI();
		System.out.println(sbi.interestRate());
		
		AXIS axis= new AXIS();
		System.out.println(axis.ineterestRate());}
		
		

	}

}
