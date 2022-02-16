package peerprogramming;

public class Factorial {
	
	public String reverse(int input) {
		
		if(input == 0) {
			return "0";
		}
		
		int currentValue = input;
		int i = 1;
		
		while(currentValue % i == 0) {
			if(currentValue / i == 1) {
				return i + "!";
			}
			currentValue = currentValue / i;
			i++;
		}
		return "None";
	}
	
}
