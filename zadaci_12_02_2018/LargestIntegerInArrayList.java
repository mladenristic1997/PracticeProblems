package zadaci_12_02_2018;

import java.util.ArrayList;

public class LargestIntegerInArrayList {
	
	public Integer largestInArrayList(ArrayList<Integer> list) {
		Integer largest = 0;
		for(Integer i : list) {
			if(i.compareTo(largest) > 0)
				largest = i;
		}
		return largest;
	}
}
