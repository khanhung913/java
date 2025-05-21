package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question09_06 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1か2を入力してください");
		String str = bf.readLine();
		int num = Integer.parseInt(str);

		if (num == 1 || num == 2) {
			System.out.println("1か２が入力されました");
		}

	}

}
