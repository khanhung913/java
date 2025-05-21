package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question09_08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("整数を入力してください。");
		int num= Integer.parseInt(bf.readLine());
		if(num%2==0) {
			System.out.println(num+"は偶数です。");
		} else {
			System.out.println(num+"は奇数です。");
		}

	}

}
