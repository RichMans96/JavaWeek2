package peerprogramming;

import java.util.ArrayList;
import java.util.List;

public class Goldilocks {

	
	public List<Integer> eat(int weight, int maxPorridgeTemp, int[] chairs, int[] temps) {
		List<Integer> placesToSit = new ArrayList<>();
		
		for(int i = 0; i < chairs.length; i++) {
			if(chairs[i] >= weight && temps[i] <= maxPorridgeTemp) {
				placesToSit.add(i);
			}
		}
		
		return placesToSit;
		
	}
	
}
