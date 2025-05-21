package question18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question18_01 {

	public static void main(String[] args) {
		System.out.println("今日の日付を表示します。");
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(df.format(date));

	}

}
