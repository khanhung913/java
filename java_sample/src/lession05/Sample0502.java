package lession05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0502 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		String str1 = reader.readLine();
		String str2 = reader.readLine();
		String str3 = reader.readLine();
		
		int num = Integer.parseInt(str);
		System.out.println(num + "が入力されました。");
		System.out.println(str1 + "が入力されました。");
		System.out.println(str2 + "が入力されました。");
		System.out.println(str3 + "が入力されました。");
		
		String test= (num>5)?"true":"false";
		System.out.println(test);
	}
}
