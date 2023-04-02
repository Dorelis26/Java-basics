package basics;

public class days {
	public static void main(String[] args) {
		//execute different block of code depending on the condition
		
		String daysOfWeek = "tuesday";
		
		switch (daysOfWeek) {
		case "monday": System.out.print("today is monday");break;
		case "tuesday": System.out.print("today is tuesday");break;
		case "wenesday": System.out.print("today is wenesday");break;
		case "thursday": System.out.print("today is thursday");break;
		case "friday": System.out.print("today is friday");break;
		case "saturday": System.out.print("today is saturday");break;
		case "sunday": System.out.print("today is sunday");break;
		default:System.out.print("not a valid day of the week");break;
		
		}
		
	}

}
