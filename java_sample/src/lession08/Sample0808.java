package lession08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0808 {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int num = Integer.parseInt(str);
		String t = (num != 0) ? "A" : "B";
		System.out.println(t);

		if (4 < num && num <= 10) {
			System.out.println(num + "は4より大きく10以下の数字です。");
		} else if (num <= 10) {
			System.out.println(num + "は4以下の数字です。");
		} else {
			System.out.println(num + "は10より大きい数字です。");
		}

	}

}
