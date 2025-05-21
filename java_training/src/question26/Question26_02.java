package question26;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question26_02 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数値を入力してください");
		try {
			String str = br.readLine();
			Integer.parseInt(str);
		} catch (Exception e) {
			System.out.println("例外が発生しました");
		} finally {
			System.out.println("システムを終了します");
		}

	}

}
