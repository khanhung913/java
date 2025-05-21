package question07;

import java.util.Arrays;

public class Question07_03 {
	public static void main(String[] args) {
		int[] num = { 30, 53, 21, 70, 60 };

		Arrays.sort(num);
		System.out.println("ソートが完了しました");

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}
}