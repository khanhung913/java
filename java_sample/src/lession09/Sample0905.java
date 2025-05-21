package lession09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0905 {

	public static void main(String[] args) throws IOException {
		System.out.println("いくつまでの合計を求めますか？");
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String str= b.readLine();
		int num=Integer.parseInt(str);
		int sum=0;
		for (int i = 1; i <= num; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
