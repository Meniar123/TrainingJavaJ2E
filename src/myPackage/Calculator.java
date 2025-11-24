package myPackage;

public class Calculator {

	int x = 10;
	int y = 20;
	private Object sum2;

	// case_1: No parameter No return

	void sum() {
		System.out.println(x + y);
	}

	// case_2: No parameter return value
	int sum1() {
		return (x + y);

	}

    //case _3 : with parameter no return value 
	void sum3(int a, int b) {
		System.out.println(a + b);
	}

	// case_4 : with parameter and return value
	int sum4(int a, int b) {
		return (a + b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
	
		cal.sum();                    //case 1
		
		int res = cal.sum1();
		System.out.println(res);      //case 2
		
		cal.sum3(20, 50);             //case 3
		
		int res2 = cal.sum4(30, 10);  //case_4
		{System.out.println(res2);
		}
		}
		
		
		
		
	}


