package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_02 {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int num= Integer.parseInt(str);

		String text= (num%10==0)?"は10の倍数です。":"は10の倍数ではありません。";
		System.out.println(num+text);
	}

}
