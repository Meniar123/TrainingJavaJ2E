package Part2;

public class ThisKeyword {
	
	int a,b;     // a,b déclarations
	
	//void getValues ( int x,int y)
	//a = x;   paramétre a
	//b = y;   parametre b

 
void getvalues (int a, int b) {
	this.a=a;
	this.b=b;
}
	
    void printValues () {
    	System.out.println(a);
    	System.out.println(b);
    }
	

	public static void main(String[] args) {
		
		ThisKeyword tk = new ThisKeyword();
		tk.getvalues(10,20);
		tk.printValues();
	}

}
