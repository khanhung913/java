package lession19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1902 {

	public static void main(String[] args) throws IOException {
		System.out.println("1つ目の文字列を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();

		System.out.println("2つ目の文字列を入力してください");
		String str2 = br.readLine();

		StringBuilder builder = new StringBuilder(str1);
		builder.append(str2);
		System.out.println(builder);

	}

}
