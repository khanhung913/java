package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question04_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str1 = bf.readLine();
		int price1 = Integer.parseInt(str1);
		String str2 = bf.readLine();
		int price2 = Integer.parseInt(str2);
		String str3 = bf.readLine();
		int price3 = Integer.parseInt(str3);

		int sum = (int) ((price1 * 0.7) + (price2 * 0.7) + (price3 * 0.7));
		int avg=(int)sum/3;
		System.out.println("合計は"+sum+"円です");
		System.out.println("平均は"+avg+"円です");
	}

}
