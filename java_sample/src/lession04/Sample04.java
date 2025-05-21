package lession04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample04 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		int num1,num2,num3;
		num1=1;
		num2=num1;
		num3=num2+1;
		System.out.println("変数num1の値は"+num1+"です。");
		System.out.println("代入後の変数num2の値は"+num2+"です。");
		System.out.println("代入後の変数num3の値は"+num3+"です。");
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		String s= bf.readLine();
		int numk= Integer.parseInt(s);
		
		
	}

}
