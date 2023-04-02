package basics;

public class cities {

	public static void main(String[] args) {
		//declare and define an array 
		
		String[] cities = {"new york","miami","dalas"};
		
		//access individual cities
		
		//for loop
		for(int i=0;i<cities.length;i++) {
			System.out.println(cities[i]);
			
		}
		
		
		
		//declare an array (only size)
		String[] states = new String[5];
		states[0]= "california";
		states[1]= "ohio";
		states[2]= "new jersey";
		states[3]= "texas";
		states[4]= "utah";
		int i = 0;		
		int n =0;
		
		System.out.println("*************");
		//the while loop will execute as long as a condition is true
		while(n<5) {
			System.out.println(states[n]);
			n++;
			
		}
		
		System.out.println("*************");
		
		//the do loop will execute first and than check condition
		do {
			System.out.println(states[i]);
			i++;
		}while(i<5);

	}

}
