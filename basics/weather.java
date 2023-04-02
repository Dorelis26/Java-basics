package basics;

public class weather {
	public static void main(String[] args) {
		//this application will give suggestions of what to ware base on the weather(temperature)
		int temperature = 85;
		
		String sunCondition = "sunny";
		
		if (temperature > 80) {
			System.out.println("It is pleasent. wear shorts and T-shirt.");
		}else if(temperature >60 && sunCondition.equals("sunny")) {
			System.out.println("It's a little cooler. perhaps wear long slives and pants. ");
			System.out.println("bring your sun glasess.");
		}else if(temperature >50 || sunCondition.equals("overcast")) {
			System.out.println("this is a cool day make sure you ware warmer cloths.");
		}
		
		else {
			System.out.println("It is cold outside, bring a sweater.");
		}
		
		
	}

}
