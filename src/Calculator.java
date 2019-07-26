
public class Calculator {
	
	int a=10;
	int b=10;
	int c;


	public void add() {
		c=a+b;
		System.out.println(c);

		System.out.println("add numbers");

	}

	public void sub() {

		System.out.println("sub numbers");

	}

	public void div() {

		System.out.println("div numbers");

	}

	public void mul() {
		
	
		

		System.out.println("mul numbers");

	}

	public static void main(String[] args) {

		Calculator Calc = new Calculator();
		Calc.add();
		Calc.sub();
		Calc.div();
		Calc.mul();
		

		System.out.println("Hello GJ");

	}

}
