package question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystenMain05 {

	public static void main(String[] args) throws IOException {
		System.out.println("年齢を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int num = Integer.parseInt(str);

		if (num < 20) {
			System.out.println("20歳未満なので、お酒の提供ができません。");
			
			

			int[] numberGroup1 = { 3, 5, 7, 9 };
			
			if (numberGroup1[3] == 3) {
				System.out.println("配列numberGroup1で4番目の数値は3です。");
			} else if (numberGroup1[3] == 5) {
				System.out.println("配列numberGroup1で4番目の数値は5です。");
			} else if (numberGroup1[3] == 7) {
				System.out.println("配列numberGroup1で4番目の数値は7です。");
			} else {
				System.out.println("配列numberGroup1で4番目の数値は3と5と7以外の数値です。");
			}
			
			
			
			System.out.println("曜日を日本語で入力してください。");
			BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
			
			String useDayInput;
			useDayInput = reader1.readLine();
			
			 switch (useDayInput) {
			 case "月曜日":
			     System.out.println("Monday");
			     break;
			 case "火曜日":
				 System.out.println("Tuesday");
				 break;
			 case "水曜日":
				 System.out.println("wednesday");
				 break;
			 case "木曜日":
				 System.out.println("thrusday");
				 break;
			 case "金曜日":
				 System.out.println("Friday");
				 break;
			 case "土曜日":
				 System.out.println("Saturday");
				 break;
			 case "日曜日":
				 System.out.println("Sunday");
				 break;
			 }
				 
			 
			 }
			

		}

}
