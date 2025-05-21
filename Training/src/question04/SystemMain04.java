package question04;

import java.util.Date;

public class SystemMain04 {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		Date date = new Date(time);
		System.out.println(date);
		Date date2= new Date();
	}
}


