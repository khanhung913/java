package question08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain08 {

	public static void main(String[] args) {
		System.out.println("入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = br.readLine();
			check(input);
		} catch (NumberFormatException | IOException e) {
			System.out.println(e.getMessage());

		}
	}

	public static void check(String receive) throws NumberFormatException {
		if (receive.equals("")) {
			throw new NumberFormatException("文字列が空なので、数値に変換できません。");
		} else {
			System.out.println("入力できています。");
		}
	}

}
