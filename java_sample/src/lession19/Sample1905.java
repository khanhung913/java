package lession19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample1905 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat df= new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("今日の日付を表示します。");
		System.out.println(df.format(date));
	}

}
