package basics;

public class strings {
	public static void main(String[]args) {
		
		//Working with Strings and methods.
		String bookTitle;
		bookTitle = "the lord of the rings";
		
		String wordChoice = "rings";
		
		
		if (bookTitle.contains("rings")) {
			System.out.println("the book contains the word "+ wordChoice);
		}
		
		String browser = "Chrome";
		
		//the equalsignorecase will ingnore the upper case
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("the browser you choose is " + browser);
		}
		
		String firstName = "Nicolas";
		String lastName = "Dorelis";
		String ID = "6564991187";
		
		//print my initials  plus last 4 digits of ID :
		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.println(ID.substring(5));
		
}
}