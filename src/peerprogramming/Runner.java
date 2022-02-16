package peerprogramming;

public class Runner {

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		
		System.out.println(fact.reverse(1));

		Doggo dogPlaces = new Doggo();
		
		System.out.println(dogPlaces.places(10));
		
		Goldilocks gl = new Goldilocks();
		
		int[] chairs = {297, 66, 257, 276, 280, 163, 193};
		int[] temps = {90, 110, 113, 191, 129, 163, 193};
		
		
		System.out.println(gl.eat(100, 120, chairs, temps));
		
	}

}
