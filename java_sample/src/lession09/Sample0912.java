package lession09;

import java.util.Arrays;
import java.util.Collections;

public class Sample0912 {

	public static void main(String[] args) {
		Integer[] numbers= {3,4,2,1,5};
		Arrays.sort(numbers,Collections.reverseOrder());
		Arrays.sort(numbers);
		for (int i : numbers) {
			System.out.println(i);
		}
		

	}

}
