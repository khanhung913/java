package question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain05 {

	public static void main(String[] args) throws IOException {
		System.out.println("年齢を入力してください");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String tempAge= br.readLine();
		int age= Integer.parseInt(tempAge);
		if(age<20)
			System.out.println("20歳未満なので、お酒の提供ができません。");
		int[] numberGroup1 = {3,5,7,9};
		if(numberGroup1[3]==3)
			System.out.println("配列numberGroup1の4番目の数値は3です。");
		else if(numberGroup1[3]==5)
			System.out.println("配列numberGroup1の4番目の数値は5です。");
		else if(numberGroup1[3]==7)
			System.out.println("配列numberGroup1の4番目の数値は7です。");
		else
			System.out.println("配列numberGroup1の4番目の数値は3と5と7以外の数値です。");
		System.out.println("曜日を日本語で入力してください");
		String userDayInput= br.readLine();
		switch(userDayInput) {
		case "月曜日":
			System.out.println("Monday");
			break;
		case "火曜日":
			System.out.println("Tuesday ");
			break;
		case "水曜日":
			System.out.println("Wednesday");
			break;
		case "木曜日":
			System.out.println("Thursday");
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
		System.out.println("数学の試験結果の点数を入力してください");
		String tempMathPoint= br.readLine();
		int math= Integer.parseInt(tempMathPoint);
		System.out.println("科学の試験結果の点数を入力してください");
		String tempSciencePoint= br.readLine();
		int science= Integer.parseInt(tempSciencePoint);
		if(math>=60&&science>=60)
			System.out.println("数学と科学ともに合格です。");
		else if(math>=60||science>=60)
			System.out.println("数学か科学どちらかが合格です。");
		else
			System.out.println("どちらも不合格です。");
}
}
