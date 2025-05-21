package question04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SystemMain04 {

	public static void main(String[] args) {
		//(1)
		String phoneNumber = "12-3456-7890";
		String message = "今日は晴れです。";
		String annotation = "ただし、午後からの降水確率は70％です。";
		System.out.println("1文字ずつ表示します。");
		for (int i = 0; i < message.length(); i++) {
			System.out.println(message.charAt(i));
		}
		System.out.println("文字列を連携します。");
		StringBuilder sconcat = new StringBuilder(message);
		sconcat.append(annotation);
		System.out.println("連結した文字列：" + sconcat);

		//(2)
		System.out.println("ランダムな数を表示します。");
		double number = Math.random();
		System.out.println(number);

		//(3)
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日E曜日");
		System.out.println("今日の日付を表示します。");
		System.out.println(sdf.format(date));

		//(4)
		Pattern pattern = Pattern.compile("^[0-9]{2}-[0-9]{4}-[0-9]{4}$");
		Matcher matcher = pattern.matcher(phoneNumber);
		if (matcher.find())
			System.out.println("パターンと一致しています。");
		else
			System.out.println("正しい番号ではありません。");
	}

}
