package basics;

public class salaryCalculator {
	public static void main(String[] args) {
		//create a variable to define our career
		
		//Declare a variable
		String career ;
		System.out.println("program is starting");
		
		career = "software Developer";
		
		System.out.println("My career is :"+career);
		
		//Declare and define
		int hoursWeek = 40;
		int weeksYear = 50;
		double rate = 42.50;
		
		double salary = hoursWeek * weeksYear * rate;
		
		
		
		//compute our annual salary
		
		System.out.println("My salary as a "+career +" is $"+ salary);
		
		//rate * hours per week * weeks per year
		
		
	}

}
