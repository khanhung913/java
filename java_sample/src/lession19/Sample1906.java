package lession19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Sample1906 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputdateString;
		do {
			System.out.println("「yyy/MM/dd」の形式で日付を入力してください");
			inputdateString = br.readLine();

		} while (isIllegalDate(inputdateString));
		System.out.println("入力した日付は正しい内容です。");

	}

	private static boolean isIllegalDate(String inputDateString) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		df.setLenient(false);
		try {
			df.parse(inputDateString);
			return false;
		} catch (ParseException e) {
			return true;
		}
	}

}
