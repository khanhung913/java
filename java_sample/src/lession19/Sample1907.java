package lession19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample1907 {

	public static void main(String[] args) throws IOException {
		System.out.println("電話番号を入力してください");
		System.out.println("入力例：xxx-xxxx-xxxx");
		String text;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		Pattern p = Pattern.compile("^[0-9]{3}-[0-9]{4}-[0-9]{4}$");
		Matcher m = p.matcher(str);
		while (!m.find()) {
			System.out.println("再入力");
			str = br.readLine();
			m = p.matcher(str);
		}
		text = str;
		System.out.println(text);
	}

}
