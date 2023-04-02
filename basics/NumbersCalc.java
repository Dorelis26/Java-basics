package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		
		//call the function from main
		
		System.out.println(addNum(5,10));
		System.out.println(printName("Nicolas"));
		System.out.println(multiplyNum(5,20));
		printText();
	}
		
	
	//create a function that will print names
	
	public static String printName(String name) {
		return"my name is "+name;
		
		
	}
	
	//create a function that will add numbers
	
	public static int addNum(int a, int b) {
		int addition = a + b;
		return addition;
		
	}
	
	//create a function that will multiply numbers
	public static double multiplyNum(double a, double b) {
		double multiply = a + b;
		return multiply;
	}
		
	//create a function that prints a sentence
		
	public static void printText(){
			System.out.println("printing text");
		}
}

